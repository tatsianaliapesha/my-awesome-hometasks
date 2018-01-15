package com.epam.hometask3.nominee;

import com.epam.hometask3.award.Award;

import java.util.Random;

public class Nominee {

    static {
        System.out.println("Initializing Nominee class ...");
    }

    private String name;

    public Nominee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void receiveAward(Award award) {
        if (!award.isSoliSet()) {
            int quantity = calculateAwardValue(award.getValue());
            award.setRecalculatedValue(quantity);
            System.out.println("Award recalculated value without soli is: " + award.getRecalculatedValue() + "\n");
        } else {
            Double quantity = award.getValue() * award.getSoli();
            award.setRecalculatedValue(quantity.intValue());
            System.out.println("Award value with soli is: " + award.getRecalculatedValue() + "\n");
            Double percent;
            int cmp = Double.compare(award.getSoli(), 1d);
            if (cmp < 0) {
                percent = (1 - award.getSoli()) * 100;
                System.out.println("New award value is less than original on " + percent + "%");
            } else if (cmp == 0) {
                System.out.println("New award value equals to original. There is no difference in percentage.");
            } else {
                percent = (award.getSoli() - 1) * 100;
                System.out.println("New award value is larger than original on " + percent + "%");
            }

        }

    }

    private Integer calculateAwardValue(Integer initialAwardValue) {
        Random random = new Random();
        int z = random.nextInt(10) + 1;
        Double c = random.nextDouble() + 0.01;
        int population = random.nextInt(50) + 1;
        int p = initialAwardValue;
        Double middleCount = ((Math.pow(z, 2) * p * (1 - p)) / Math.pow(c, 2));
        Double quantity = middleCount / (1 + ((middleCount - 1) / population));   //quantity = ((Z^2*(P)*(1-P))/(C^2)) / (1 + ((((Z^2*(P)*(1-P ))/(C^2))-1)/population))
        return quantity.intValue();
    }


}
