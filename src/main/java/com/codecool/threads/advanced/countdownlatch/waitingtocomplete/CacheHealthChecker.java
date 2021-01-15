package com.codecool.threads.advanced.countdownlatch.waitingtocomplete;

import java.util.concurrent.CountDownLatch;

public class CacheHealthChecker implements Runnable {

    private final CountDownLatch countDownLatch;

    public CacheHealthChecker(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("Checking Cache connection...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Cache is UP!");
        countDownLatch.countDown();
    }
}
