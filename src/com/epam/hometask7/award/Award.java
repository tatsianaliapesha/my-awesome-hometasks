package com.epam.hometask7.award;

/**
 * Created by Tatsiana_Liapesha on 1/29/2018.
 */
public class Award {

    static {
        System.out.println("Initializing Award class ...");
    }

    private final int value;
    private int recalculatedValue;
    private Double soli;
    private final boolean isSoliSet;

    public boolean isSoliSet() {
        return isSoliSet;
    }

    public Double getSoli() {
        return soli;
    }

    public Award(int value, Double soli) {
        this.value = value;
        this.soli = soli;
        isSoliSet = true;
    }

    public Award(int value) {
        this.value = value;
        isSoliSet = false;
    }

    public int getValue() {
        return value;
    }

    public int getRecalculatedValue() {
        return recalculatedValue;
    }

    public void setRecalculatedValue(int recalculatedValue) {
        this.recalculatedValue = recalculatedValue;
    }

}
