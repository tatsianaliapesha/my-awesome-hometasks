package com.epam.hometask2.award;

public class Award {

    static {
        System.out.println("Initializing Award class ...");
    }

    private final Integer value;

    public Award(Integer value) {
        this.value = value;
    }

    public Number getValue() {
        return value;
    }
}
