package com.epam.hometask6.nominator;

import com.epam.hometask6.award.Award;
import com.epam.hometask6.person.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tatsiana_Liapesha on 1/19/2018.
 */
public class Nominator extends Person {

    private int nominatorAwardQuantityLimit;
    private double nominatorAwardAmountLimit;
    private List<Award> givenAwards = new ArrayList<>();

    public Nominator() {
    }

    public Nominator(String username) {
        super(username);
    }

    public Nominator(String username, int nominatorAwardQuantityLimit, double nominatorAwardAmountLimit) {
        this(username);
        this.nominatorAwardQuantityLimit = nominatorAwardQuantityLimit;
        this.nominatorAwardAmountLimit = nominatorAwardAmountLimit;
    }

    public int getNominatorAwardQuantityLimit() {
        return nominatorAwardQuantityLimit;
    }

    public void setNominatorAwardQuantityLimit(int nominatorAwardQuantityLimit) {
        this.nominatorAwardQuantityLimit = nominatorAwardQuantityLimit;
    }

    public double getNominatorAwardAmountLimit() {
        return nominatorAwardAmountLimit;
    }

    public void setNominatorAwardAmountLimit(double nominatorAwardAmountLimit) {
        this.nominatorAwardAmountLimit = nominatorAwardAmountLimit;
    }

    public List<Award> getGivenAwards() {
        return givenAwards;
    }

    public void setGivenAwards(List<Award> awards) {
        this.givenAwards = awards;
    }

    @Override
    public void addPrivileges() {
        super.addPrivileges();
        getPrivileges().add("NOMINATOR");
    }

    @Override
    public String toString() {
        return ("This is a Nominator class.");
    }
}
