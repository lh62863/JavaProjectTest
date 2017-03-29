package com.fqa;

import java.io.IOException;
import java.io.InputStream;

public class TestRuntime {
	public static void main(String[] args) throws IOException {
		Runtime runtime = Runtime.getRuntime();
		Process process = runtime.exec("hostname");
		byte[] b = new byte[1024];
		
		InputStream inputStream = process.getInputStream();
		int i = 0;
		StringBuilder builder = new StringBuilder();
		while ((i = inputStream.read(b)) > 0) {
			String st = new String(b);
			builder.append(st);
		}
		System.out.println(builder);
		
		System.out.println("hello world!!!");
	}
}
