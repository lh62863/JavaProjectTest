package com.thread;

import java.util.Calendar;

public class Daemon {
    public static void main(String[] args) {
        Thread thread = new Thread(new DaemonRunner(), "DaemonRunner");
        thread.setDaemon(false);
        System.out.println("in the main thread");
        thread.start();
        
        System.out.println("out of the main time is: " + Calendar.getInstance().getTime());
}
    static class DaemonRunner implements Runnable {
        @Override
        public void run() {
            try {
            		System.out.println("the DaemonThread begin to run");
                SleepUtils.second(3);
                System.out.println("out of daemon time is: " + Calendar.getInstance().getTime());
            } finally {
                System.out.println("DaemonThread finally run.");
            }
        }
    }
}