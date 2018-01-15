package com.epam.hometask2.nominee;

import com.epam.hometask2.award.Award;

public class Nominee {

    static {
        System.out.println("Initializing Nominee class ...");
    }

    private String name;

    public Nominee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void receiveAward(Award award) {
        System.out.println("Award value is: " + award.getValue());
    }
}
