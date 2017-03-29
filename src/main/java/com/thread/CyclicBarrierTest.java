package com.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {
	public static void main(String[] args) {
		CyclicBarrier cyclicBarrier = new CyclicBarrier(4, new Runnable() {
			
			@Override
			public void run() {
				System.out.println("选中" + Thread.currentThread().getName() + "来执行barrier方法");
			}
		});
		for (int i = 0; i < 4; i++) {
			Writer writer = new Writer(cyclicBarrier);
			writer.start();
		}
	}
	
	static class Writer extends Thread {
		private CyclicBarrier cyclicBarrier;
		
		public Writer(CyclicBarrier cyclicBarrier) {
			this.cyclicBarrier = cyclicBarrier;
		}
		
		public void run() {
			System.out.println("进程" + currentThread().getName() + "正在写入数据。。。");
			try {
				Thread.sleep(2000);
				System.out.println("进程" + currentThread().getName() + "写入完毕，等待去他线程完毕");
				cyclicBarrier.await();
				System.out.println("进程" + currentThread().getName() + "完毕");
			} catch (InterruptedException | BrokenBarrierException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
