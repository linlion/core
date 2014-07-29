package com.linlion.core;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.linlion.core.BEAN.beanBean;

public class childBean {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure()
				.buildSessionFactory();
		Session session1 = null;
		Session session2 = null;
		try {// 有使用者1开启了一个session1
			session1 = sf.openSession();
			// 在这之后，马上有另一个使用者2开启了session2
			session2 = sf.openSession();
			// 使用者1查询数据
			beanBean userV1 = (beanBean) session1.load(beanBean.class,
					"f4f03813-d04a-4764-b319-906989dae36d");
			// 使用者2查询同一条数据
			beanBean userV2 = (beanBean) session2.load(beanBean.class,
					"f4f03813-d04a-4764-b319-906989dae36d");
			// 此时两个版本号是相同的
			System.out.println("v1=" + userV1.getVersion() + ",v2="
					+ userV2.getVersion());
			Transaction tx1 = session1.beginTransaction();
			Transaction tx2 = session2.beginTransaction();
			// 使用者1更新数据
			userV1.setBeanNo("665");
			session1.merge(userV1);
			tx1.commit();
			// 此时由于数据更新，数据库中的版本号递增了
			// 两笔数据版本号不一样了
			System.out.println("v1=" + userV1.getVersion() + ",v2="
					+ userV2.getVersion());// userV2 的age 数据还是旧的
			// 数据更新
			userV2.setBeanName("version test");
			// 因版本号比数据库中的旧
			// 修改会失败，抛出StableObjectStateException例外
			tx2.commit();
		} catch (Exception err) {
			err.printStackTrace();
		} finally {System.out.println(123);
			session1.close();
			session2.close();
		}
	}
}