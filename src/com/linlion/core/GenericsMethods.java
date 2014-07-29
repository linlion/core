package com.linlion.core;

import com.linlion.core.copy.copyBean;

public class GenericsMethods {
	// 简单的示例输出对应的类名
	public <T, x> T method(T x) {
		System.out.println("SampleName:  " + x.getClass().getSimpleName()
				+ "  |  Name:  " + x.getClass().getName());
		return x;
	}

	public static void main(String[] args) {
		GenericsMethods gm = new GenericsMethods();
		String s = "cooole";
		int i0 = 23;
		Integer i1 = 13;
		copyBean cb = null;
//		= gm.method(cb);
		System.out.println(copyBean.class.getName());

		gm.method(s);
		gm.method(10.F);
		gm.method(i0);
		Class<copyBean> a=gm.method(copyBean.class);
		a.getName();
		System.out.println(a.getName());
	}
}