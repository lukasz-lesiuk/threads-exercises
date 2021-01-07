package com.codecool.threads.exercise3;

public class FibonacciGeneratorThread extends Thread {

    private final int maxNumber;

    public FibonacciGeneratorThread(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    @Override
    public void run() {
        System.out.println("Fibonacci Series of " + maxNumber + " numbers: ");
        for (int i = 0; i < maxNumber; i++) {
            System.out.println(fibonacciRecursion(i) + " ");
        }
    }

    private int fibonacciRecursion(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacciRecursion(n - 2) + fibonacciRecursion(n - 1);
    }

}
