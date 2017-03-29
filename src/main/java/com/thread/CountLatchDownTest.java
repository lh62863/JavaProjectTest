package com.thread;

import java.util.concurrent.CountDownLatch;

public class CountLatchDownTest {
	public static void main(String[] args) throws InterruptedException {
		CountDownLatch latch = new CountDownLatch(2);
		
		Thread one = new Thread() {
			public void run() {
				System.out.println("进程一正在运行");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("进程一运行结束");
				latch.countDown();
			}
		};
		one.start();
		Thread two = new Thread() {
			public void run() {
				System.out.println("进程二正在运行");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("进程二运行结束");
				latch.countDown();
			}
		};
		two.start();
		// 利用join能够达到相同的效果
		System.out.println("等待两个子进程进行执行");
		latch.await();
//		two.join();
//		one.join();
		System.out.println("两个子进程运行完毕");
		System.out.println("main进程运行完毕");
	}
}
