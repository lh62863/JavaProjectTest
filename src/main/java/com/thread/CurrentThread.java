package com.thread;

public class CurrentThread {
	
	public static void main(String[] args) {
		MyThread thread = new MyThread();

		Thread thread1 = new Thread(thread, "A");
		Thread thread2 = new Thread(thread, "B");
		Thread thread3 = new Thread(thread, "C");
		Thread thread4 = new Thread(thread, "D");
		Thread thread5 = new Thread(thread, "E");
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
	}
}
