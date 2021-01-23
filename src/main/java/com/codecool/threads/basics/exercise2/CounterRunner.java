package com.codecool.threads.basics.exercise2;

public class CounterRunner extends Thread {
    private int counter = 1;
    private static final int MAX = 10000;

    @Override
    public void run() {
        System.out.println("Counting started...");
        try {
            while (counter <= MAX) {
                System.out.println(counter);
                counter++;
                sleep(1000);}
            } catch (InterruptedException e) {
                System.out.println("INTERRUPTED");
            }
        System.out.println("Counting finished.");
    }
}
