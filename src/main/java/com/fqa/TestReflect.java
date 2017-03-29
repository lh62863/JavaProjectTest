package com.fqa;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflect {
	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		Class c = Class.forName("com.fqa.CpuNumer");
		Object object = c.newInstance();
		
		Method[] methods = c.getMethods();
		for (Method method : methods) {
//			System.out.println(method.getName());
			if ("one".equals(method.getName())) {
				method.invoke(object);
			}
		}
		String oneString = "one";
//		oneString. = 'j';
	}

}
