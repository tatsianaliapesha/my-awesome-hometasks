package com.epam.hometask8.nominator;

import com.epam.hometask8.award.Award;
import com.epam.hometask8.person.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tatsiana_Liapesha on 1/30/2018.
 */
public class Nominator extends Person {

    private int nominatorAwardQuantityLimit;
    private int nominatorAwardAmountLimit;
    private List<Award> givenAwards = new ArrayList<>();

    public Nominator(String username) {
        super(username);
    }

    public Nominator(String username, int nominatorAwardQuantityLimit, int nominatorAwardAmountLimit) {
        this(username);
        this.nominatorAwardQuantityLimit = nominatorAwardQuantityLimit;
        this.nominatorAwardAmountLimit = nominatorAwardAmountLimit;
    }

    public int getNominatorAwardQuantityLimit() {
        return nominatorAwardQuantityLimit;
    }

    public int getNominatorAwardAmountLimit() {
        return nominatorAwardAmountLimit;
    }

    public List<Award> getGivenAwards() {
        return givenAwards;
    }

    public void setGivenAwards(List<Award> awards) {
        this.givenAwards = awards;
    }


    @Override
    public boolean isLimitReached(int transitionalLimit) {

        System.out.println("Verifying nominator limit...");
        return (transitionalLimit >= nominatorAwardAmountLimit);
    }

    @Override
    public void addPrivileges() {
        super.addPrivileges();
        getPrivileges().add("NOMINATOR");
    }

    @Override
    public void addPrivileges(List<String> privileges) {
        System.out.println("Adding privileges for Nominator.");
        super.addPrivileges(privileges);
    }
}

