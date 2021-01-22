package com.codecool.threads.advanced.lessons.phaser;

import java.util.concurrent.Phaser;

public class MyThread implements Runnable {

    private Phaser phaser;
    private String threadName;

    public MyThread(Phaser phaser, String threadName) {
        this.phaser = phaser;
        this.threadName = threadName;
        phaser.register();
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Thread: " + threadName
                + "\nPhase One Started");
        phaser.arriveAndAwaitAdvance();

        // Stop execution to prevent jumbled output
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Thread: " + threadName
                + "\nPhase Two Started");
        phaser.arriveAndAwaitAdvance();

        // Stop execution to prevent jumbled output
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Thread: " + threadName
                + "\nPhase Three Started");
        phaser.arriveAndDeregister();
    }
}
