package com.codecool.threads.advanced.excercises.excercise8;

public class Word {

    private String name;

    public Word(String name) {
        this.name = name;
    }

    public void concat(String letter) {
        name = name + letter;
    }

    public String getName() {
        return name;
    }

    public boolean startsFromM() {
        return name.startsWith("M");
    }
}
