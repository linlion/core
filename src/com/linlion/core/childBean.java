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
		try {// ��ʹ����1������һ��session1
			session1 = sf.openSession();
			// ����֮����������һ��ʹ����2������session2
			session2 = sf.openSession();
			// ʹ����1��ѯ����
			beanBean userV1 = (beanBean) session1.load(beanBean.class,
					"f4f03813-d04a-4764-b319-906989dae36d");
			// ʹ����2��ѯͬһ������
			beanBean userV2 = (beanBean) session2.load(beanBean.class,
					"f4f03813-d04a-4764-b319-906989dae36d");
			// ��ʱ�����汾������ͬ��
			System.out.println("v1=" + userV1.getVersion() + ",v2="
					+ userV2.getVersion());
			Transaction tx1 = session1.beginTransaction();
			Transaction tx2 = session2.beginTransaction();
			// ʹ����1��������
			userV1.setBeanNo("665");
			session1.merge(userV1);
			tx1.commit();
			// ��ʱ�������ݸ��£����ݿ��еİ汾�ŵ�����
			// �������ݰ汾�Ų�һ����
			System.out.println("v1=" + userV1.getVersion() + ",v2="
					+ userV2.getVersion());// userV2 ��age ���ݻ��Ǿɵ�
			// ���ݸ���
			userV2.setBeanName("version test");
			// ��汾�ű����ݿ��еľ�
			// �޸Ļ�ʧ�ܣ��׳�StableObjectStateException����
			tx2.commit();
		} catch (Exception err) {
			err.printStackTrace();
		} finally {System.out.println(123);
			session1.close();
			session2.close();
		}
	}
}