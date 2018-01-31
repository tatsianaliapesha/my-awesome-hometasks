package com.epam.hometask8.person;

import com.epam.hometask8.operations.OperationsWithLimit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tatsiana_Liapesha on 1/30/2018.
 */
public abstract class Person implements OperationsWithLimit {

    private String username;

    private List<String> privileges  = new ArrayList<>();

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

    public void addPrivileges(){

        this.privileges.add("COMPANY_ACTIVITY_PARTICIPANT");
        this.privileges.add("AWARD_WEB_VIEWER");
    }

    public void addPrivileges(List<String> privileges){
        this.privileges.addAll(privileges);
    }


}
