package com.epam.hometask9.person;

import com.epam.hometask9.operations.OperationsWithLimit;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple model of Person data
 */
public abstract class Person implements OperationsWithLimit {

    private String username;

    private List<String> privileges = new ArrayList<>();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<String> privileges) {
        this.privileges = privileges;
    }

    public abstract boolean isLimitReached(int transitionalLimit);

    public Person() {
    }

    public Person(String username) {
        this.username = username;
    }

    /**
     * Add 2 specific privileges to a person.
     */
    public void addPrivileges() {

        this.privileges.add("COMPANY_ACTIVITY_PARTICIPANT");
        this.privileges.add("AWARD_WEB_VIEWER");
    }

    /**
     * Add privileges to a person.
     *
     * @param privileges - optional list of privileges
     */
    public void addPrivileges(List<String> privileges) {
        this.privileges.addAll(privileges);
    }


}
