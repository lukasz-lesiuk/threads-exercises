package com.codecool.threads.advanced.lessons.exchanger;

import java.util.concurrent.Exchanger;

public class Producer implements Runnable {

    private BlockingQueue blockingQueue;
    private final Exchanger<BlockingQueue> exchanger;

    public Producer(Exchanger<BlockingQueue> exchanger, BlockingQueue blockingQueue) {
        this.exchanger = exchanger;
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        try {
            String packet = "First packet";
            blockingQueue.put(packet);
            blockingQueue = exchanger.exchange(blockingQueue);
            System.out.println(Thread.currentThread().getName() + " fills: " + packet);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
