package com.codecool.threads.exercise2;

public class CounterRunner implements Runnable {

    private int counter = 0;

    @Override
    public void run() {
        System.out.println("Counting started...");
        while (true) {
            System.out.println(counter);
            counter++;
        }
    }
}
