package com.codecool.threads.advanced.excercises.excercise8;

import java.util.concurrent.Exchanger;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Exchanger<Word> exchanger = new Exchanger<>();
        Word word = new Word("");

        MConcatenator mConcatenator = new MConcatenator(exchanger, word);
        AConcatenator aConcatenator = new AConcatenator(exchanger, word);

        mConcatenator.start();
        aConcatenator.start();

        mConcatenator.join();
        aConcatenator.join();

        System.out.println(word.getName());
    }
}
