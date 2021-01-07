package com.codecool.threads.exercise5;

public class ProducerConsumer {


    public static void main(String[] args) {
        BlockingQueue blockingQueue = new BlockingQueue(3);

        Thread producer = new Thread(new Producer(blockingQueue));
        Thread consumer = new Thread(new Consumer(blockingQueue, 8));

        producer.start();
        consumer.start();
    }
}
