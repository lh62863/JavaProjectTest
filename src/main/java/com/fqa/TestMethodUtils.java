package com.fqa;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.commons.lang3.reflect.MethodUtils;

import com.lee.TestDecimal;

public class TestMethodUtils {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        TestDecimal test = new TestDecimal();
//        Method[] methods = test.getClass().getMethods();
//        for (Method method : methods) {
//            if (method.getName().equals("speek")) {
//                method.invoke(test);
//            }
//        }
        MethodUtils.invokeMethod(test, "speek");
    }
}
