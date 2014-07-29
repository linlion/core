package com.linlion.core.util;

import java.util.Date;
import java.util.UUID;

public class charUtil {

	public static String toUppercaseAll(String str) {
		if (str != null) {
			str = str.toUpperCase();
		}
		return str;

	}

	public static String toLowerCaseAll(String str) {
		if (str != null) {
			str = str.toLowerCase();
		}
		return str;
	}

	public static String toUppercaseFirstLetter(String str) {
		if (str != null && !str.equals("")) {
			str = toUppercaseAll(str.substring(0, 1)) + str.substring(1);
		}
		return str;

	}

	public static String toLowerCaseFirstLetter(String str) {
		if (str != null && !str.equals("")) {
			str = toLowerCaseAll(str.substring(0, 1)) + str.substring(1);
		}
		return str;

	}

	public static int string2int(String str) {
		int i = -1;
		if (str != null && !str.equals("")) {
			i = Integer.parseInt(str);
		}
		return i;

	}

	public static String date2String(Date d) {
		return d.toString();
	}
	
	public static String UUID() {
		return UUID.randomUUID().toString();
	}

	public static void main(String[] args) {


	}
}
