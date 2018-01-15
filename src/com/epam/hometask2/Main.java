package com.epam.hometask2;

import com.epam.hometask2.award.Award;
import com.epam.hometask2.nominator.Nominator;
import com.epam.hometask2.nominee.Nominee;

public class Main {

    public static void main(String[] args){
        Award award = new Award(500);
        Nominee nominee = new Nominee("Richie_Recipient");
        Nominator nominator = new Nominator("Norma_Nominator");
        nominator.nominate(nominee, award);
    }
}
