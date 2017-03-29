package com.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
	Lock lock = new ReentrantLock();
//	Lock lock2 = new ReentrantLock();
	public static void main(String[] args) {
		LockTest test = new LockTest();
		for (int i = 0; i < 4; i++) {
			Thread thread = new Thread(new Runnable() {				
				@Override
				public void run() {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					test.say();
				}
			});
			thread.start();
		}
		
		for (int i = 0; i < 4; i++) {
			Thread thread = new Thread(new Runnable() {				
				@Override
				public void run() {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					test.speek();
				}
			});
			thread.start();
		}
	}
	
	public void say() {
		lock.lock();
		System.out.println("say开始#####");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("say结束#####");
		lock.unlock();
	}
	
	public void speek() {
		lock.lock();
		System.out.println("speek开始。。。。");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("speek结束。。。。");
		lock.unlock();
	}
}
