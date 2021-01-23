package com.codecool.threads.basics.exercise5;

public class Consumer implements Runnable {

    private final BlockingQueue blockingQueue;
    private final int packetsLimits;

    public Consumer(BlockingQueue blockingQueue, int packetsLimits) {
        this.blockingQueue = blockingQueue;
        this.packetsLimits = packetsLimits;
    }

    @Override
    public void run() {

    }
}
