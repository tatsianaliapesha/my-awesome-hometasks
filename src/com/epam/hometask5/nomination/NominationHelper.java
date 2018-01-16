package com.epam.hometask5.nomination;

import com.epam.hometask5.award.Award;
import com.epam.hometask5.nominator.Nominator;
import com.epam.hometask5.nominee.Nominee;

import java.util.List;

/**
 * Created by Tatsiana_Liapesha on 1/16/2018.
 */
public class NominationHelper {

    /**
     * Nominator gives an award to nominee.
     *
     * @param nominator - nominator object
     * @param nominee   - nominee object
     * @param award     - award object
     */
    public static void nominate(Nominator nominator, Nominee nominee, Award award) {

        System.out.println("Nominee name is: " + nominee.getName());
        nominee.receiveAward(award);

        List<Award> nominatorAwardsList = nominator.getAwards();
        nominatorAwardsList.add(award);
        nominator.setAwards(nominatorAwardsList);
    }
}
