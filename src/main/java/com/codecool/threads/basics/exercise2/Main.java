package com.codecool.threads.basics.exercise2;

import com.codecool.threads.exercise1.CounterThread;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread runnable =new CounterRunner();

        runnable.start();
        Thread.sleep(3000);
        runnable.interrupt();





    }
}
