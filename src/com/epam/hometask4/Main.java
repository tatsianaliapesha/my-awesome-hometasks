package com.epam.hometask4;

import com.epam.hometask4.award.Award;
import com.epam.hometask4.award.AwardService;
import com.epam.hometask4.nominator.Nominator;
import com.epam.hometask4.nominee.Nominee;

public class Main {

    public static void main(String[] args) {

        Award award1 = new Award(100, 1.2);
        Award award2 = new Award(100);
        Award award3 = new Award(250, 1.0);
        Award award4 = new Award(250);

        Nominator nominator = new Nominator("Norma_Nominator", 5, 500);
        Nominee nomineeManfred = new Nominee("Manfred_Manager4", 4, 250);
        Nominee nomineeRichie = new Nominee("Richie_Recipient", 3, 100);
        Nominee nomineeMandy = new Nominee("Mandy_Manager1", 2, 150);
        Nominee nomineeMorris = new Nominee("Morris_Manager5", 4, 250);

        //Nominate by NominatorAwardQuantityLimit
        int counter1 = 0;
        for (int i = 0; i < nominator.getNominatorAwardQuantityLimit(); i++) {
            int value = AwardService.calculateAwardValue(award1);
            award1.setRecalculatedValue(value);
            nominator.nominate(nomineeManfred, award1);
            counter1++;
        }

        getLimitInfo("Nominator", "QuantityLimit", counter1, 0);

        //Nominate by NominatorAwardAmountLimit
        int counter2 = 0;
        int nominatorAwardAmount = 0;
        int value = AwardService.calculateAwardValue(award2);
        award2.setRecalculatedValue(value);
        nominatorAwardAmount+=value;

        do {
            nominator.nominate(nomineeRichie, award2);
            value = AwardService.calculateAwardValue(award2);
            nominatorAwardAmount+=value;
            award2.setRecalculatedValue(value);
            counter2++;

        } while (nominatorAwardAmount < nominator.getNominatorAwardAmountLimit());

        System.out.println("\nLimit is = " + nominator.getNominatorAwardAmountLimit());
        System.out.println("nominatorAwardAmount = " + nominatorAwardAmount);
        getLimitInfo("Nominator", "AmountLimit", counter2, nomineeRichie.getNomineeRealAmount());

        if (nomineeRichie.getNomineeRealAmount() > nominator.getNominatorAwardAmountLimit())
            System.out.println("Error. Total amount exceeds the NominatorAwardAmountLimit. \n");
        if (nomineeRichie.getNomineeRealAmount() == nominator.getNominatorAwardAmountLimit())
            System.out.println("Total amount equals to the NominatorAwardAmountLimit. \n");
        if (nomineeRichie.getNomineeRealAmount() < nominator.getNominatorAwardAmountLimit())
            System.out.println("Total amount less than the NominatorAwardAmountLimit. \n");

        //Nominate by NomineeAwardQuantityLimit
        int counter3 = 0;
        do {
            value = AwardService.calculateAwardValue(award3);
            award3.setRecalculatedValue(value);
            nominator.nominate(nomineeMandy, award3);
            counter3++;

        } while (counter3 < nomineeMandy.getNomineeAwardQuantityLimit());

        getLimitInfo("Nominee", "QuantityLimit", counter3, 0);

        int nomineeAwardAmount = 0;
        value = AwardService.calculateAwardValue(award4);
        award4.setRecalculatedValue(value);
        nomineeAwardAmount+=value;

        //Nominate by NomineeAwardAmountLimit
        int counter4 = 0;
        while (nomineeAwardAmount < nomineeMorris.getNomineeAwardAmountLimit()) {

            nominator.nominate(nomineeMorris, award4);
            value = AwardService.calculateAwardValue(award4);
            award4.setRecalculatedValue(value);
            nomineeAwardAmount += value;
            counter4++;
        }

        System.out.println("\nLimit is = " + nomineeMorris.getNomineeAwardAmountLimit());
        System.out.println("Real amount:" + nomineeMorris.getNomineeRealAmount());
        System.out.println("nomineeAwardAmount = " + nomineeAwardAmount);
        getLimitInfo("Nominee", "AmountLimit", counter4, nomineeMorris.getNomineeRealAmount());

        if (nomineeMorris.getNomineeRealAmount() > nomineeMorris.getNomineeAwardAmountLimit())
            System.out.println("Error. Total amount exceeds the NomineeAwardAmountLimit.");
        if (nomineeMorris.getNomineeRealAmount() == nomineeMorris.getNomineeAwardAmountLimit())
            System.out.println("Total amount equals to the NomineeAwardAmountLimit.");
        if (nomineeMorris.getNomineeRealAmount() < nomineeMorris.getNomineeAwardAmountLimit())
            System.out.println("Total amount less than the NomineeAwardAmountLimit.");


    }


    public static void getLimitInfo(String userType, String limitType, int numberOfAwards, int totalAmount) {
        StringBuilder builder = new StringBuilder();
        builder.append("Limit type is: " + limitType + "\n");
        switch (limitType) {
            case "QuantityLimit":
                builder.append("Amount of awards is: " + numberOfAwards + " for " + userType + "\n");
                break;
            case "AmountLimit":
                builder.append("Total amount: " + totalAmount + " for " + userType + "\n");
                break;
            default:
                break;

        }
        System.out.println(builder.toString());
    }
}
