package com.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread implements Runnable{
	
	private AtomicInteger count = new AtomicInteger(5);
	
	@Override
	public void run() {
		synchronized(count) {
			count.decrementAndGet();
			System.out.println(Thread.currentThread().getName() + ": count=" + count);
		} 
	}
}
