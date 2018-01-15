package com.epam.hometask3;

import com.epam.hometask3.award.Award;
import com.epam.hometask3.nominator.Nominator;
import com.epam.hometask3.nominee.Nominee;

public class Main {

    public static void main(String[] args) {
        Award award1 = new Award(100, 4.5);
        Award award2 = new Award(100);
        Award award3 = new Award(250, 1.0);
        Award award4 = new Award(250);
        Award award5 = new Award(500, 0.8);
        Award award6 = new Award(500);

        Nominee nominee1 = new Nominee("Richie_Recipient");
        Nominee nominee2 = new Nominee("Morris_Manager5");
        Nominee nominee3 = new Nominee("Mandy_Manager1");
        Nominator nominator = new Nominator("Norma_Nominator");

        nominator.nominate(nominee1, award1);
        nominator.nominate(nominee1, award2);
        nominator.nominate(nominee2, award3);
        nominator.nominate(nominee2, award4);
        nominator.nominate(nominee3, award5);
        nominator.nominate(nominee3, award6);

        if (award1.getRecalculatedValue() != award2.getRecalculatedValue())
            System.out.println("Richie's award1 value is not equal to award2 value.");

        if (award1.getRecalculatedValue() >= award2.getRecalculatedValue())
            System.out.println("Richie's award1 value is greater than award2 value.");

        if ((award1.getRecalculatedValue() == award2.getRecalculatedValue()) || (award1.getRecalculatedValue() < award2.getRecalculatedValue()))
            System.out.println("Richie's award1 value is less than award2 value.");

        if ((award3.getRecalculatedValue() > 20) && (award3.getRecalculatedValue() < 45))
            System.out.println("Morris's award is in range between 20 and 45.");

        if (!(award4.getRecalculatedValue() > 20))
            System.out.println("Morris's award is less than 20.");

    }
}
