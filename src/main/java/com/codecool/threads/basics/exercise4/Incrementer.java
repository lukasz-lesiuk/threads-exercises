package com.codecool.threads.basics.exercise4;

public class Incrementer extends Thread {

    private final Counter counter;
    private final int limit;

    public Incrementer(Counter counter, int limit) {
        this.counter = counter;
        this.limit = limit;
    }

    @Override
    public void run() {
        for (int i = 0; i < limit; i++) {
            counter.incrementCount();
        }
    }
}
