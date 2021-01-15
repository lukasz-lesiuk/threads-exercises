package com.codecool.threads.advanced.countdownlatch.waitingtostart;

import java.util.concurrent.CountDownLatch;

public class Worker implements Runnable {

    private final CountDownLatch startSignal;
    private final CountDownLatch doneSignal;

    public Worker(CountDownLatch startSignal, CountDownLatch doneSignal) {
        this.startSignal = startSignal;
        this.doneSignal = doneSignal;
    }

    @Override
    public void run() {
        try {
            report("entered run()");
            startSignal.await();
            report("doing work");
            Thread.sleep((int) (Math.random() * 1000));
            doneSignal.countDown();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void report(String context) {
        System.out.println(System.currentTimeMillis() +
                ": " + Thread.currentThread() +
                ": " + context);
    }
}
