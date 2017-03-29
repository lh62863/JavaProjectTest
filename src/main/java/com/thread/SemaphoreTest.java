package com.thread;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {
	public static void main(String[] args) {
		Semaphore semaphore = new Semaphore(4);
		for (int i = 0; i < 8; i++) {
			Worker worker = new Worker(semaphore);
			worker.start();
		}
	}
	
	private static class Worker extends Thread {
		private Semaphore semaphore;
		
		public Worker(Semaphore semaphore) {
			this.semaphore = semaphore;
		}
		
		public void run() {
			try {
				semaphore.acquire();
				System.out.println("进程" + currentThread().getName() + "获得了机器");
				Thread.sleep(2000);
				System.out.println("进程" + currentThread().getName() + "释放了.....");
				semaphore.release();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
	}
}
