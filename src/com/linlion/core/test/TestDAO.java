package com.linlion.core.test;

import com.linlion.core.DaoFactory;
import com.linlion.core.bean.beanBean;

public class TestDAO {
	public static void main(String args[]) throws Exception {
//		Emp emp = null;
//		for (int i = 0; i < 5; i++) {
//			emp = new Emp();
//			emp.setEmpno(i);
//			emp.setEname("xiazdong-" + i);
//			emp.setJob("stu-" + i);
//			emp.setHireDate(new java.util.Date());
//			emp.setSal(500 * i);
////			DAOFactory.getInstance().doCreate(emp);
			
//		}
//		System.out.println(new Date().getTime());
//		Emp e= DAOFactory.getInstance().findById(1);
//		System.out.println(e.toString()) ;
//		System.out.println(new Date().getTime());
		
//		beanBean bb=new beanBean();
//		bb.setBeanName("ÄãÄãfdsfdsÄãÄã");
//		DAOFactory.getInstance().doCreateTable(bb);
		beanBean bb= DaoFactory.getInstance("com.linlion.core.bean.beanDaoFactory").findById("12345");
//		Object o=DAOFactory.getInstance();
		System.out.println(bb.getUuid());
//		System.out.println(bb.getBeanName());
//		((beanBean) DAOFactory.getInstance()).doCreateTable(bb);
//		beanBean bb=(beanBean) o;
		
		
	}
}