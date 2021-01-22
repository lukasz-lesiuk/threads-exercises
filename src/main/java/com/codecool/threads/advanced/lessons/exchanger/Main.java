package com.codecool.threads.advanced.lessons.exchanger;

import java.util.concurrent.Exchanger;

public class Main {

    public static void main(String[] args) {
        BlockingQueue blockingQueue = new BlockingQueue();
        Exchanger<BlockingQueue> exchanger = new Exchanger<>();

        Consumer consumer = new Consumer(exchanger, blockingQueue);
        Producer producer = new Producer(exchanger, blockingQueue);

        Thread producerThread = new Thread(producer, "Producer");
        Thread consumerThread = new Thread(consumer, "Consumer");

        producerThread.start();
        consumerThread.start();
    }
}
