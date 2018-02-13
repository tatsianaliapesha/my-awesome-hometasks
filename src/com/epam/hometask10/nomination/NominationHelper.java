package com.epam.hometask10.nomination;

import com.epam.hometask10.award.Award;
import com.epam.hometask10.exception.LimitIsReachedException;
import com.epam.hometask10.nominator.Nominator;
import com.epam.hometask10.nominee.Nominee;

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
    public static void nominate(Nominator nominator, Nominee nominee, Award award) throws LimitIsReachedException{

        System.out.println("Nominee name is: " + nominee.getUsername());

        if(nominator.getGivenAwards().size() >= nominator.getNominatorAwardQuantityLimit())
            throw new LimitIsReachedException("NominatorAwardQuantityLimit is exceeded.");

        if(nominee.getReceivedAwards().size() >= nominee.getNomineeAwardQuantityLimit())
            throw new LimitIsReachedException("NomineeAwardQuantityLimit is exceeded.");

        nominee.receiveAward(award);
        List<Award> nominatorAwardsList = nominator.getGivenAwards();
        nominatorAwardsList.add(award);
        nominator.setGivenAwards(nominatorAwardsList);
    }
}
