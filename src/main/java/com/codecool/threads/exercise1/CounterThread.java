package com.codecool.threads.exercise1;


public class CounterThread extends Thread {
    private int counter = 5;

    public CounterThread() {
    }

    @Override
    public void run() {
        while (counter > 0) {
            System.out.println(this.getState());
            System.out.println((this.getName()));
            System.out.println((this.getId()));
            System.out.println("----------------");
            counter--;
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
