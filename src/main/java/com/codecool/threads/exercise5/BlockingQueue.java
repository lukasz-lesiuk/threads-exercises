package com.codecool.threads.exercise5;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {

    private final Queue<String> queue = new LinkedList<>();
    private final int capacity;

    public BlockingQueue(int capacity) {
        this.capacity = capacity;
    }

    public String take() throws InterruptedException {
        return null;
    }


    public void put(String packet) throws InterruptedException {

    }

}
