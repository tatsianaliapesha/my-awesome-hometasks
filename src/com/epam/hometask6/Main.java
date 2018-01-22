package com.epam.hometask6;

import com.epam.hometask6.award.Award;
import com.epam.hometask6.nomination.NominationHelper;
import com.epam.hometask6.nominator.Nominator;
import com.epam.hometask6.nominee.Nominee;

/**
 * Created by Tatsiana_Liapesha on 1/19/2018.
 */
public class Main
{
    public static void main(String[] args){

        Nominator nominator = new Nominator("Norma_Nominator", 5, 500);
        Nominee nomineeManfred = new Nominee("Manfred_Manager4", 4, 250);

        nominator.addPrivileges();
        System.out.println(nominator.getPrivileges());

        nomineeManfred.addPrivileges();
        System.out.println(nomineeManfred.getPrivileges());

        System.out.println(nominator.toString());
        System.out.println(nomineeManfred.toString());
    }

}
