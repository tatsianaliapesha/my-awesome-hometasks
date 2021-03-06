package com.epam.hometask10.nominator;

import com.epam.hometask10.award.Award;
import com.epam.hometask10.person.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * The specific object model of Nominator.
 */
public class Nominator extends Person {

    private int nominatorAwardQuantityLimit;
    private int nominatorAwardAmountLimit;
    private boolean limitReached;
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

    public boolean isLimitReached() {
        return limitReached;
    }

    public void setLimitReached(boolean limitReached) {
        this.limitReached = limitReached;
    }

    /**
     * Method verifies if specific amount reached the allowed maximum. In this case the allowed maximum is specified in nominatorAwardAmountLimit
     *
     * @param transitionalLimit - transitional amount received by the moment
     * @return true if limit is reached false otherwise
     */
    @Override
    public boolean isLimitReached(int transitionalLimit) {

        System.out.println("Verifying nominator limit...");
        if(transitionalLimit >= nominatorAwardAmountLimit)
            setLimitReached(true);
        return isLimitReached();
    }

    /**
     * Add common privileges and specific Nominator privilege
     */
    @Override
    public void addPrivileges() {
        super.addPrivileges();
        getPrivileges().add("NOMINATOR");
    }

    /**
     * Add optional privileges to Nominator.
     *
     * @param privileges - optional list of privileges
     */
    @Override
    public void addPrivileges(List<String> privileges) {
        System.out.println("Adding privileges for Nominator.");
        super.addPrivileges(privileges);
    }
}

