package com.epam.hometask10;

import com.epam.hometask10.award.Award;
import com.epam.hometask10.award.AwardService;
import com.epam.hometask10.exception.LimitIsReachedException;
import com.epam.hometask10.nomination.NominationHelper;
import com.epam.hometask10.nominator.Nominator;
import com.epam.hometask10.nominee.Nominee;

/**
 * Example of exception handling process.
 */
public class Main {
    public static void main(String[] args) throws LimitIsReachedException {

        Award award1 = new Award(100, 1.2);
        Award award2 = new Award(100);

        Nominator nominator = new Nominator("Norma_Nominator", 5, 500);
        Nominee nomineeRichie = new Nominee("Richie_Recipient", 6, 100);
        Nominee nomineeManfred = new Nominee("Manfred_Manager4", 4, 250);

        try {
            for (int i = 0; i <= nominator.getNominatorAwardQuantityLimit(); i++) {
                int value = AwardService.calculateAwardValue(award1);
                award1.setRecalculatedValue(value);
                NominationHelper.nominate(nominator, nomineeManfred, award1);
            }
        } catch (LimitIsReachedException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }

        try {
            for (int i = 0; i <= nominator.getNominatorAwardQuantityLimit(); i++) {
                int value = AwardService.calculateAwardValue(award2);
                award2.setRecalculatedValue(value);
                NominationHelper.nominate(nominator, nomineeRichie, award2);
            }
        } catch (LimitIsReachedException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
