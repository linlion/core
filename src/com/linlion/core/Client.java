package com.linlion.core;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.linlion.core.BEAN.beanBean;

public class Client {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure()
				.buildSessionFactory();
		Session s = null;
		Transaction t = null;
		try {
			// ׼������
			beanBean um = new beanBean();
			um.setBeanNo("2545ggg43");
			um.setBeanName("��˹���ȷ��ɽ�����˹�ٷ�");
			s = sf.openSession();
			t = s.beginTransaction();
			s.save(um);
			t.commit();
		} catch (Exception err) {
			t.rollback();
			err.printStackTrace();
		} finally {
			s.close();
		}
	}
}