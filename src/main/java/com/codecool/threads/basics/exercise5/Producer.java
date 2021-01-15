package com.codecool.threads.basics.exercise5;

public class Producer implements Runnable {

    private BlockingQueue blockingQueue;

    public Producer(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {

    }
}
