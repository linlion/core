package com.linlion.core.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class classUtil {
	public static <T> ArrayList<T> getBean(ResultSet rs, T object)
			throws Exception {
		Class<?> classType = object.getClass();
		ArrayList<T> objList = new ArrayList<T>();
		// SqlRowSet srs = jdbcTemplate.queryForRowSet(sql);
		Field[] fields = classType.getDeclaredFields();// �õ������е��ֶ�
		T objectCopy = null;
		while (rs.next()) {
			// ÿ��ѭ��ʱ������ʵ����һ���봫�����Ķ�������һ���Ķ���
			objectCopy = (T) classType.getConstructor(new Class[] {})
					.newInstance(new Object[] {});
			for (int i = 0; i < fields.length; i++) {
				Field field = fields[i];
				String fieldName = field.getName();
				Object value = null;
				// �����ֶ����;����������ʹ������get������������ȡ������
				if (field.getType().equals(String.class)) {
					value = rs.getString(fieldName);
					if (value == null) {
						value = "";
					}
				}
				if (field.getType().equals(int.class)) {
					value = rs.getInt(fieldName);
				}
				if (field.getType().equals(java.util.Date.class)) {
					value = rs.getDate(fieldName);
				}
				// ������Ե�����ĸ��ת��Ϊ��д����setXXX��Ӧ
				String firstLetter = fieldName.substring(0, 1).toUpperCase();
				String setMethodName = "set" + firstLetter
						+ fieldName.substring(1);
				Method setMethod = classType.getMethod(setMethodName,
						new Class[] { field.getType() });
				setMethod.invoke(objectCopy, new Object[] { value });// ���ö����setXXX����
			}
			objList.add(objectCopy);
		}

		return objList;
	}
}
