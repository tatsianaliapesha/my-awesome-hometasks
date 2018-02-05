package com.epam.hometask9.award;

/**
 * A simple model of award data
 */
public class Award {

    static {
        System.out.println("Initializing Award class ...");
    }

    private int value;
    private int recalculatedValue;
    private Double soli;
    private boolean isSoliSet;
    private int id;
    private String type;

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

    public Award(int id, int value, String type){
        this.id = id;
        this.value = value;
        this.type = type;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Award award = (Award) o;

        if (value != award.value) return false;
        if (recalculatedValue != award.recalculatedValue) return false;
        if (isSoliSet != award.isSoliSet) return false;
        if (id != award.id) return false;
        if (soli != null ? !soli.equals(award.soli) : award.soli != null) return false;
        return type.equals(award.type);
    }

    @Override
    public int hashCode() {
        int result = value;
        result = 31 * result + recalculatedValue;
        result = 31 * result + (soli != null ? soli.hashCode() : 0);
        result = 31 * result + (isSoliSet ? 1 : 0);
        result = 31 * result + id;
        result = 31 * result + type.hashCode();
        return result;
    }
}
