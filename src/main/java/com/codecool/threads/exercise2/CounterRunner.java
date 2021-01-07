package com.codecool.threads.exercise2;

public class CounterRunner implements Runnable {
    private int counter = 1;
    private static final int MAX = 10000;

    @Override
    public void run() {
        System.out.println("Counting started...");
        while (counter <= MAX) {
            System.out.println(counter);
            counter++;
        }
        System.out.println("Counting finished.");
    }
}
