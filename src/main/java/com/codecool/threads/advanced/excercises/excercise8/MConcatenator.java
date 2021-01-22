package com.codecool.threads.advanced.excercises.excercise8;

import java.util.concurrent.Exchanger;

public class MConcatenator extends Thread {
    private Exchanger<Word> exchanger;
    private Word word;

    public MConcatenator(Exchanger<Word> exchanger, Word word) {
        this.exchanger = exchanger;
        this.word = word;
    }

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                word.concat("M");
                word = exchanger.exchange(word);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
