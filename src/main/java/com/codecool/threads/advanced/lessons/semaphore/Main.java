package com.codecool.threads.advanced.lessons.semaphore;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(2);

        MyThread myThread1 = new MyThread(semaphore, "A");
        MyThread myThread2 = new MyThread(semaphore, "B");

        myThread1.start();
        myThread2.start();

        myThread1.join();
        myThread1.join();

        System.out.println("count: " + Shared.count);
    }


}
