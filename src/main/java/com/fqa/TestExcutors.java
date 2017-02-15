package com.fqa;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExcutors {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = new Random().nextInt(10);
                System.out.println(i);
            }
        });
        executorService.execute(thread);
        
    }
}
