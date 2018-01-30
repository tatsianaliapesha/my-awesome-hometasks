package com.epam.hometask7.nomination;

import com.epam.hometask7.award.Award;
import com.epam.hometask7.nominator.Nominator;
import com.epam.hometask7.nominee.Nominee;

import java.util.List;

/**
 * Created by Tatsiana_Liapesha on 1/29/2018.
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
