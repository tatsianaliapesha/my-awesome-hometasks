package com.epam.hometask7;

import com.epam.hometask7.award.Award;
import com.epam.hometask7.award.AwardService;
import com.epam.hometask7.nomination.NominationHelper;
import com.epam.hometask7.nominator.Nominator;
import com.epam.hometask7.nominee.Nominee;

/**
 * Created by Tatsiana_Liapesha on 1/29/2018.
 */
public class Main {

    public static void main(String[] args) {

        Award award1 = new Award(100, 1.2);
        Award award2 = new Award(100);

        Nominator nominator = new Nominator("Norma_Nominator", 5, 500);
        Nominee nomineeRichie = new Nominee("Richie_Recipient", 3, 100);
        Nominee nomineeManfred = new Nominee("Manfred_Manager4", 4, 250);

        //Nominate by NominatorAwardAmountLimit
        int nominatorAwardAmount = 0;
        int value = AwardService.calculateAwardValue(award2);
        award2.setRecalculatedValue(value);
        nominatorAwardAmount += value;

        do {
            NominationHelper.nominate(nominator, nomineeRichie, award2);
            value = AwardService.calculateAwardValue(award2);
            nominatorAwardAmount += value;
            award2.setRecalculatedValue(value);

        } while (!nominator.isLimitReached(nominatorAwardAmount));

        System.out.println("\nLimit is = " + nominator.getNominatorAwardAmountLimit());
        System.out.println("nominatorAwardAmount = " + nominatorAwardAmount);
        System.out.println("Total amount of money given to nominee = " + nomineeRichie.getNomineeRealAmount() + "\n");


        //Nominate by NomineeAwardAmountLimit
        int nomineeAwardAmount = 0;
        while (!nomineeManfred.isLimitReached(nomineeAwardAmount)) {

            NominationHelper.nominate(nominator, nomineeManfred, award1);
            value = AwardService.calculateAwardValue(award1);
            award1.setRecalculatedValue(value);
            nomineeAwardAmount += value;
        }

        System.out.println("\nLimit is = " + nomineeManfred.getNomineeAwardAmountLimit());
        System.out.println("nomineeAwardAmount = " + nomineeAwardAmount);
        System.out.println("Total amount of money given to nominee = " + nomineeManfred.getNomineeRealAmount());

    }
}
