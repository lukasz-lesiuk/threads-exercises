package com.codecool.threads.advanced.lessons.phaser;

import java.util.concurrent.Phaser;

public class Main {

    public static void main(String[] args) {
        Phaser phaser = new Phaser();
        int currentPhase;

        System.out.println("Starting");

        new MyThread(phaser, "A");
        new MyThread(phaser, "B");
        new MyThread(phaser, "C");

        // Wait for all threads to complete phase one.
        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase "
                + currentPhase
                + " Complete");
        System.out.println("Phase One Ended");

        // Wait for all threads to complete phase two.
        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase "
                + currentPhase
                + " Complete");
        System.out.println("Phase Two Ended");

        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase "
                + currentPhase
                + " Complete");
        System.out.println("Phase Three Ended");

        // Deregister the main thread.
        phaser.arriveAndDeregister();
        if (phaser.isTerminated()) {
            System.out.println("Phaser is terminated");
        }
    }

}
