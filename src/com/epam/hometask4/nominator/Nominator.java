package com.epam.hometask4.nominator;

import com.epam.hometask4.award.Award;
import com.epam.hometask4.nominee.Nominee;

public class Nominator {

    static {
        System.out.println("Initializing Nominator class ...");
    }

    private String name;
    private int nominatorAwardQuantityLimit;
    private double nominatorAwardAmountLimit;

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

    public Nominator(String name) {
        this.name = name;
    }

    public Nominator(String name, int nominatorAwardQuantityLimit, double nominatorAwardAmountLimit) {
        this.name = name;
        this.nominatorAwardAmountLimit = nominatorAwardAmountLimit;
        this.nominatorAwardQuantityLimit = nominatorAwardQuantityLimit;
    }

    public void nominate(Nominee nominee, Award award) {
        System.out.println("\nNominee name is: " + nominee.getName());
        nominee.receiveAward(award);
    }
}
