package com.codecool.threads.advanced.lessons.semaphore;

import java.util.concurrent.Semaphore;

public class Decrementer extends Thread {
    private final Semaphore semaphore;
    private final static String threadName = "Decrementer";

    public Decrementer(Semaphore semaphore) {
        super(threadName);
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            System.out.println("Starting " + threadName);
            System.out.println("Thread " + threadName + " acquiring the lock");

            semaphore.acquire();
            System.out.println(threadName + " gets a permit.");

            for (int i = 0; i < 5; i++) {
                Shared.count--;
                System.out.println(threadName + ": " + Shared.count);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadName + " releases the permit.");
        semaphore.release();
    }
}
