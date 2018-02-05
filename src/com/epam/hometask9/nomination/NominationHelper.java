package com.epam.hometask9.nomination;

import com.epam.hometask9.award.Award;
import com.epam.hometask9.nominator.Nominator;
import com.epam.hometask9.nominee.Nominee;

import java.util.List;

/**
 * Service class to operate with nomination.
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

        System.out.println("Nominee name is: " + nominee.getUsername());
        nominee.receiveAward(award);

        List<Award> nominatorAwardsList = nominator.getGivenAwards();
        nominatorAwardsList.add(award);
        nominator.setGivenAwards(nominatorAwardsList);
    }
}
