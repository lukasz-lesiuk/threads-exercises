package com.codecool.threads.exercise4;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        for(int i =0; i<10; i++) {

            Counter counter = new Counter();

            int limit = 200_000;

            Incrementer incrementer1 = new Incrementer(counter, limit);
            Incrementer incrementer2 = new Incrementer(counter, limit);

            incrementer1.start();
            incrementer2.start();

            incrementer1.join();
            incrementer2.join();

            System.out.printf("Expected: %s | Current: %s%n", limit * 2, counter.getCount());
        }
    }

}
