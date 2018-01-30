package com.epam.hometask7.nominator;

import com.epam.hometask7.award.Award;
import com.epam.hometask7.person.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tatsiana_Liapesha on 1/29/2018.
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
        if (transitionalLimit >= nominatorAwardAmountLimit)
            return true;
        else
            return false;
    }

}
