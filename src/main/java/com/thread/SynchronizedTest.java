package com.thread;

public class SynchronizedTest implements Runnable{
	private String name = "One";
	
	public synchronized void speek() {
		System.out.println("speek....");
		try {
			synchronized (name) {
				this.wait();
				name.wait();
			}
			System.out.println("then wait....");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public  void talk() {
		System.out.println("talk....");
		this.notify();
	}
	
	public static void main(String[] args) {
		SynchronizedTest test = new SynchronizedTest();
		Thread thread1 = new Thread(test);
		Thread thread2 = new Thread(test);
		Thread thread3 = new Thread(test);
		Thread thread4 = new Thread(test);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread4.start();
		thread1.start();
		thread2.start();
		thread3.start();
	}

	@Override
	public void run() {
		speek();
		talk();
	}
}
