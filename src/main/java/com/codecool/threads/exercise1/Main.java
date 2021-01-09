package com.codecool.threads.exercise1;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new CounterThread();
        Thread thread2 = new CounterThread();
//        Thread thread3 = new CounterThread();

        thread.start();
        thread2.start();


//        thread.start();

//        thread.join();

//        System.out.println(thread.getState());
    }
}
