package com.epam.hometask3.nominator;

import com.epam.hometask3.award.Award;
import com.epam.hometask3.nominee.Nominee;

public class Nominator {

    static {
        System.out.println("Initializing Nominator class ...");
    }

    private String name;

    public Nominator(String name) {
        this.name = name;
    }

    public void nominate(Nominee nominee, Award award) {
        System.out.println("\nNominee name is: " + nominee.getName());
        nominee.receiveAward(award);
    }
}
