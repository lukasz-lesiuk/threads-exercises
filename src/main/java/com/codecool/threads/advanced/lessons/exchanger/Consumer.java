package com.codecool.threads.advanced.lessons.exchanger;

import java.util.concurrent.Exchanger;

public class Consumer implements Runnable {

    private BlockingQueue blockingQueue;
    private final Exchanger<BlockingQueue> exchanger;

    public Consumer(Exchanger<BlockingQueue> exchanger, BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        if (blockingQueue.nonEmpty()) {
            try {
                String packet = blockingQueue.take();
                blockingQueue = exchanger.exchange(blockingQueue);
                System.out.println(Thread.currentThread().getName() + " consumes: " + packet);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
