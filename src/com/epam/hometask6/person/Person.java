package com.epam.hometask6.person;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tatsiana_Liapesha on 1/19/2018.
 */
public class Person {

    private String username;
    private List<String> privileges;


    public Person() {
    }

    public Person(String username) {
        this.username = username;
    }

    public Person(String username, List<String> privileges){
        this.username = username;
        this.privileges = privileges;
    }

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

    public void addPrivileges(){
        privileges = new ArrayList<>();
        privileges.add("COMPANY_ACTIVITY_PARTICIPANT");
        privileges.add("AWARD_WEB_VIEWER");
    }

    public String toString(){
        return ("This is a Person class.");
    }
}
