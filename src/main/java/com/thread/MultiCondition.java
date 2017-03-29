package com.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MultiCondition {
	public static void main(String[] args) {
		List<Integer> queue = new ArrayList<Integer>();
		Lock lock = new ReentrantLock();
		int MAX_SIZE = 1;
		queue.add(1);
		Condition notFull = lock.newCondition();
		Condition notEmpty = lock.newCondition();
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				lock.lock();
				while (queue.size() == MAX_SIZE) {
					try {
						notFull.await();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				queue.add(new Random().nextInt(100));
				notEmpty.signal();
				System.out.println("添加了一个数到队列，发出通知信号");
				lock.unlock();
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
				
			@Override
			public void run() {
				lock.lock();
				while (queue.size() == 0) {
					try {
						notEmpty.await();
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
				int num = queue.remove(0);
				System.out.println(num + "出队列");
				notFull.notify();
				lock.unlock();
			}
		});
		
		thread1.start();
		thread2.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
