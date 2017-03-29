package com.fqa;

public class CpuNumer {
	private String id;
	
	public CpuNumer(String id) {
		this.id = id;
	}
	public static void main(String[] args) {
		int num = Runtime.getRuntime().availableProcessors();
		System.out.println("num=" + num);
	}
	
	public void one() {
		System.out.println("I am the one ");
	}
}
