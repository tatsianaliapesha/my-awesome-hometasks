package com.epam.hometask7.nominee;

import com.epam.hometask7.award.Award;
import com.epam.hometask7.person.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tatsiana_Liapesha on 1/29/2018.
 */
public class Nominee extends Person {

    private int nomineeAwardQuantityLimit;
    private int nomineeAwardAmountLimit;
    private int nomineeRealAmount;
    private List<Award> receivedAwards = new ArrayList<>();

    public Nominee() {
    }

    public Nominee(String username, int nomineeAwardQuantityLimit, int nomineeAwardAmountLimit) {
        super();
        setUsername(username);
        this.nomineeAwardQuantityLimit = nomineeAwardQuantityLimit;
        this.nomineeAwardAmountLimit = nomineeAwardAmountLimit;
    }

    public void receiveAward(Award award) {
        receivedAwards.add(award);
        nomineeRealAmount += award.getRecalculatedValue();
    }

    @Override
    public boolean isLimitReached(int transitionalLimit) {

        System.out.println("Verifying nominee limit...");
        return (transitionalLimit >= nomineeAwardAmountLimit);

    }

    public int getNomineeAwardQuantityLimit() {
        return nomineeAwardQuantityLimit;
    }

    public int getNomineeAwardAmountLimit() {
        return nomineeAwardAmountLimit;
    }

    public int getNomineeRealAmount() {
        return nomineeRealAmount;
    }
}
