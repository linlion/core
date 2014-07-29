package com.linlion.core;

import java.lang.reflect.Constructor;

/**
 * 抽象工厂模式
 * 
 * @author Administrator
 * 
 */
public abstract class DaoFactory {
	public static DaoFactory getInstance(String classname) {

		// Class cls = Class.forName("com.linlion.core.beanDaoProxy");
		// Class dao = Class.forName("com.linlion.core.beanDao");
		// cls.newInstance();
		//
		// Constructor con = cls.getConstructor();
		// Object obj = con.newInstance();

		DaoFactory dao = null;
		try {
			dao = (DaoFactory) Class.forName(classname).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dao;
	}

	public static <T> T getInstance2(String classname) throws Exception {

		Class cls = Class.forName(classname);
		// Class dao = Class.forName("com.linlion.core.beanDao");
		// cls.newInstance();
		//
		// Constructor con = cls.getConstructor();
		// dao = (Class) cls.newInstance();

		return (T) cls.newInstance();
	}

	public static <T> T getInstance3(String classname) throws Exception {

		Constructor con = DaoFactory.getInstance2(classname);

		return (T) con;
	}

}
