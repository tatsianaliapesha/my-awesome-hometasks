package com.epam.hometask8;

import com.epam.hometask8.nominator.Nominator;
import com.epam.hometask8.nominee.Nominee;
import com.epam.hometask8.person.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Example of polymorphysm usage.
 */
public class Main {

    public static void main(String[] args) {

        List<String> privileges = new ArrayList<>();
        privileges.add("FEEDBACK_PARTICIPANT");
        privileges.add("CHECKINS_PARTICIPANT");

        Person[] persons = new Person[]{new Nominator("Norma_Nominator", 5, 500),
                new Nominee("Richie_Recipient", 3, 100),
                new Nominee("Manfred_Manager4", 4, 250)};

        for (Person person : persons) {
            person.addPrivileges();
            System.out.println(person.getUsername());
            System.out.println(person.getPrivileges());
        }

        for (Person person : persons) {
            person.addPrivileges(privileges);
            System.out.println(person.getUsername());
            System.out.println(person.getPrivileges());
        }

    }


}
