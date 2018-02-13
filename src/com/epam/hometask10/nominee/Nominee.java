package com.epam.hometask10.nominee;

import com.epam.hometask10.award.Award;
import com.epam.hometask10.person.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The specific object model of Nominee.
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

    /**
     * Include given award to the list of received awards and recalculate total amount of received money
     *
     * @param award - given award
     */
    public void receiveAward(Award award) {
        receivedAwards.add(award);
        nomineeRealAmount += award.getRecalculatedValue();
    }

    public List<Award> getReceivedAwards() {
        return Collections.unmodifiableList(receivedAwards);
    }

    /**
     * Method verifies if specific amount reached the allowed maximum. In this case the allowed maximum is specified in nomineeAwardAmountLimit
     *
     * @param transitionalLimit - transitional amount received by the moment
     * @return true if limit is reached false otherwise
     */
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

    /**
     * Add common privileges and specific Nominee privilege
     */
    @Override
    public void addPrivileges() {
        super.addPrivileges();
        getPrivileges().add("NOMINEE");
    }
}

