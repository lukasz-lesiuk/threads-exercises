package com.codecool.threads.advanced.lessons.semaphore;

import java.util.concurrent.Semaphore;

public class MyThread extends Thread {

    private Semaphore semaphore;
    private final String threadName;

    public MyThread(Semaphore semaphore, String threadName) {
        super(threadName);
        this.semaphore = semaphore;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        if (threadName.equals("A")) {
            try {

                System.out.println("Starting " + threadName);
                System.out.println("Thread " + threadName + " acquiring the lock");

                semaphore.acquire();
                System.out.println(threadName + " gets a permit.");

                for (int i = 0; i < 5; i++) {
                    Shared.count++;
                    System.out.println(threadName + ": " + Shared.count);
                    Thread.sleep(10);
                }


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadName + " releases the permit.");
            semaphore.release();

        } else {
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
}