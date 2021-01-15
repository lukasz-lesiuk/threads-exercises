package com.codecool.threads.advanced.countdownlatch.waitingtostart;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch startSignal = new CountDownLatch(1);
        CountDownLatch doneSignal = new CountDownLatch(3);

        Worker worker = new Worker(startSignal, doneSignal);

        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            executor.execute(worker);
        }

        System.out.println("Main thread started to work");
        Thread.sleep(5000);
        startSignal.countDown();
        System.out.println("main thread doing something else");
        doneSignal.await();
        executor.shutdownNow();
    }
}
