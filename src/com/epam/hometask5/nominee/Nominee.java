package com.epam.hometask5.nominee;

import com.epam.hometask5.award.Award;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tatsiana_Liapesha on 1/16/2018.
 */
public class Nominee {

    static {
        System.out.println("Initializing Nominee class ...");
    }

    private String name;
    private int nomineeAwardQuantityLimit;
    private int nomineeAwardAmountLimit;
    private int nomineeRealAmount;
    private List<Award> awards = new ArrayList<>();

    public Nominee(String name) {
        this.name = name;
    }

    public Nominee(String name, int nomineeAwardQuantityLimit, int nomineeAwardAmountLimit) {
        this.name = name;
        this.nomineeAwardQuantityLimit = nomineeAwardQuantityLimit;
        this.nomineeAwardAmountLimit = nomineeAwardAmountLimit;
    }

    public int getNomineeRealAmount() {
        return nomineeRealAmount;
    }

    public void setNomineeRealAmount(int nomineeRealAmount) {
        this.nomineeRealAmount = nomineeRealAmount;
    }

    public String getName() {
        return name;
    }

    public int getNomineeAwardQuantityLimit() {
        return nomineeAwardQuantityLimit;
    }

    public void setNomineeAwardQuantityLimit(int nomineeAwardQuantityLimit) {
        this.nomineeAwardQuantityLimit = nomineeAwardQuantityLimit;
    }

    public int getNomineeAwardAmountLimit() {
        return nomineeAwardAmountLimit;
    }

    public void setNomineeAwardAmountLimit(int nomineeAwardAmountLimit) {
        this.nomineeAwardAmountLimit = nomineeAwardAmountLimit;
    }


    public void receiveAward(Award award) {
        awards.add(award);
        nomineeRealAmount += award.getRecalculatedValue();
    }

}
