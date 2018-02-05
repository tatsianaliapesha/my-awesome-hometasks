package com.epam.hometask9;


import com.epam.hometask9.award.Award;
import com.epam.hometask9.award.AwardService;

import java.util.*;

/**
 * Example of using Collection API
 */
public class Main {

    public static void main(String[] args) {

        List<Award> awardsList = new ArrayList<>();
        Random random = new Random();

        //The list of award types
        String[] awardTypes = new String[]{"Thank You!", "Wisper Out!", "Call Out!", "Shout Out!", "Birthday", "5 Years Of Service"};

        int awardTypesListSize = awardTypes.length;
        int initialValue = 0;

        for (int i = 0; i < 15; i++) {
            Award award = new Award(i, initialValue, awardTypes[random.nextInt(awardTypesListSize)]);
            awardsList.add(award);
            initialValue += 100;
        }

        for (int i = 0; i < 15; i++) {
            System.out.println("Award id=" + awardsList.get(i).getId() + "; award value=" + awardsList.get(i).getValue() + "; award type = " + awardsList.get(i).getType());
        }

        //Print out all awards of some specific type:
        AwardService.printAwards(awardsList, "Thank You!");
        AwardService.printAwards(awardsList, "Wisper Out!");
        AwardService.printAwards(awardsList, "Call Out!");
        AwardService.printAwards(awardsList, "Shout Out!");
        AwardService.printAwards(awardsList, "Birthday");
        AwardService.printAwards(awardsList, "5 Years Of Service");

        //Print out the list of all types, using SET collection.
        Set<String> typesList = new HashSet<>();

        for (Award award : awardsList) {
            typesList.add(award.getType());
        }

        System.out.println("\nPrint out all award types:");
        Iterator<String> itr = typesList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        //Verify that equals method is used to compare 2 awards.
        Set<Award> awardsSet = new HashSet<>();
        Award award1 = new Award(15, 2000, "Thank You!");
        Award award2 = new Award(15, 2000, "Thank You!");

        awardsSet.add(award1);
        awardsSet.add(award2);

        //Final awards set should consist of 1 award:
        System.out.println("\nAwards set size is: " + awardsSet.size());

    }
}
