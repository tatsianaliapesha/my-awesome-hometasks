package com.epam.hometask8.operations;

/**
 * Created by Tatsiana_Liapesha on 1/30/2018.
 */
public interface OperationsWithLimit {

    /**
     * Method verifies if specific amount reached the allowed maximum.
     *
     * @param transitionalLimit - the specific amount of money given to a person that is compared to the maximum limit.
     * @return true if limit is reached, otherwise false.
     */
    public boolean isLimitReached(int transitionalLimit);
}
