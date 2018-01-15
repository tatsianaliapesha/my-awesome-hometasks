package com.epam.hometask2.nominator;

import com.epam.hometask2.award.Award;
import com.epam.hometask2.nominee.Nominee;

public class Nominator {

    static {
        System.out.println("Initializing Nominator class ...");
    }

    private String name;

    public Nominator(String name) {
        this.name = name;
    }

    public void nominate(Nominee nominee, Award award) {
        System.out.println("Nominee name is: " + nominee.getName());
        nominee.receiveAward(award);
    }
}
