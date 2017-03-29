package com.fqa;

public class TestIntern {
	public static void main(String[] argsv) {
		String a = "a";
		System.out.println(a.intern());
		String b = "b";
		String c = "ab";
		String d = "a" + "b";
		System.out.println(c.intern());
		System.out.println(d);
		System.out.println(c.intern() == d);
	}
}	
