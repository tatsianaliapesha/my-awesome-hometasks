package com.epam.hometask6.nominee;

import com.epam.hometask6.award.Award;
import com.epam.hometask6.person.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tatsiana_Liapesha on 1/19/2018.
 */
public class Nominee extends Person {

    private int nomineeAwardQuantityLimit;
    private int nomineeAwardAmountLimit;
    private int nomineeRealAmount;
    private List<Award> receivedAwards = new ArrayList<>();

    public Nominee() {
    }

    public Nominee(String name, int nomineeAwardQuantityLimit, int nomineeAwardAmountLimit) {
        super(name);
        this.nomineeAwardQuantityLimit = nomineeAwardQuantityLimit;
        this.nomineeAwardAmountLimit = nomineeAwardAmountLimit;
    }

    public int getNomineeRealAmount() {
        return nomineeRealAmount;
    }

    public void setNomineeRealAmount(int nomineeRealAmount) {
        this.nomineeRealAmount = nomineeRealAmount;
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

    public List<Award> getReceivedAwards() {
        return receivedAwards;
    }

    public void setReceivedAwards(List<Award> receivedAwards) {
        this.receivedAwards = receivedAwards;
    }

    public void receiveAward(Award award) {
        receivedAwards.add(award);
        nomineeRealAmount += award.getRecalculatedValue();
    }

    @Override
    public void addPrivileges() {
        super.addPrivileges();
        getPrivileges().add("NOMINEE");
    }
}
