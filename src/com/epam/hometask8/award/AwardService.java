package com.epam.hometask8.award;

import java.util.Random;

/**
 * Created by Tatsiana_Liapesha on 1/30/2018.
 */
public class AwardService {

    /**
     * Calculate award amount depending on the initial value and soli
     *
     * @param award - award object with specified data
     * @return - calculated value
     */
    public static int calculateAwardValue(Award award) {
        int quantity = 0;
        if (!award.isSoliSet()) {
            quantity = calculateAwardValueWithFormula(award.getValue());
            System.out.println("Award recalculated value without soli is: " + quantity);
        } else {
            Double soliQuantity = award.getValue() * award.getSoli();
            quantity = soliQuantity.intValue();
            System.out.println("Award value with soli is: " + quantity);
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
        return quantity;
    }


    /**
     * Calculates a new award quantity by this formula:
     * quantity = ((Z^2*(P)*(1-P))/(C^2)) / (1 + ((((Z^2*(P)*(1-P ))/(C^2))-1)/population))
     *
     * @param initialAwardValue
     * @return - calculated quantity
     */
    public static int calculateAwardValueWithFormula(Integer initialAwardValue) {
        Random random = new Random();
        int z = random.nextInt(10) + 1;
        Double c = random.nextDouble() + 0.01;
        int population = random.nextInt(50) + 1;
        int p = initialAwardValue;
        Double middleCount = ((Math.pow(z, 2) * p * (1 - p)) / Math.pow(c, 2));
        middleCount /= (1 + ((middleCount - 1) / population));
        return middleCount.intValue();
    }
}
