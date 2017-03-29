package com.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockConditionTest {
	public static void main(String[] args) {
		final Lock lock = new ReentrantLock();
		Condition good = lock.newCondition();
		Condition bad = lock.newCondition();
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					lock.lock();
					System.out.println("我要等一个信号");
					good.await();
					System.out.println("我取得了信号");
				} catch (Exception e) {
					// TODO: handle exception
				}finally {
					lock.unlock();
				}
			}
		});
		
		thread1.start();
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				lock.lock();
				System.out.println("我拿到了锁");
				try {
					Thread.sleep(2000);
					good.signalAll();
					System.out.println("我发了一个信号");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
			}
		});
		thread2.start();
	}
}
