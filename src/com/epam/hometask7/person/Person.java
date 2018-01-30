package com.epam.hometask7.person;

import com.epam.hometask7.operations.IOperationsWithLimit;

/**
 * Created by Tatsiana_Liapesha on 1/29/2018.
 */
public abstract class Person implements IOperationsWithLimit {

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public abstract boolean isLimitReached(int transitionalLimit);

    public Person() {
    }

    public Person(String username) {
        this.username = username;
    }

}
