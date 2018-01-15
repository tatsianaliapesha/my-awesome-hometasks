package com.epam.hometask3.award;

/**
 * Created by Tatsiana_Liapesha on 12/15/2017.
 */
public class AwardChild extends Award {
    public AwardChild(Integer value) {
        super(value);
    }

    @Override
    public int getValue() {
        return (Integer) super.getValue();
    }
}
