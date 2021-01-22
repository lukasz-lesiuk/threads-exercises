package com.codecool.threads.advanced.lessons.exchanger;

import java.util.Arrays;
import java.util.List;
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
        List<String> packets = Arrays.asList(
                "Packet 1",
                "Packet 2",
                "Packet 3",
                "Packet 4",
                "Packet 5",
                "Packet 6",
                "Packet 7",
                "Packet 8",
                "Packet 9",
                "Packet 10");

        for (String packet : packets) {
            try {
                blockingQueue.put(packet);
                blockingQueue = exchanger.exchange(blockingQueue);
                System.out.println(Thread.currentThread().getName() + " putting: " + packet);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
