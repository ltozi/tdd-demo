package com.kaleyra.tdd;

import java.lang.*;

public class RangeValidator implements Validator<Integer> {

    private Integer min;
    private Integer max;

    private boolean isMinInclusive = true;
    private boolean isMaxInclusive = true;

    public RangeValidator(Integer min, Integer max) {
        this.min = min;
        this.max = max;
    }

    public RangeValidator(int min, int max, boolean isMinInclusive, boolean isMaxInclusive) {
        this(min, max);

        this.isMinInclusive = isMinInclusive;
        this.isMaxInclusive = isMaxInclusive;
    }

    @Override
    public void validate(Integer arg) throws IllegalArgumentException {
        int downSlack = isMinInclusive ? 0 : 1;
        int upSlack   = isMaxInclusive ? 0 : 1;

        String minMessage = arg + " is lower than min range " + min;
        String maxMessage = arg + " is higher than max range " + max;

        minMessage = isMinInclusive ?  minMessage: minMessage + " (exclusive)";
        maxMessage = isMinInclusive ?  maxMessage: maxMessage + " (exclusive)";

        if (arg < min + downSlack) throw new IllegalArgumentException(minMessage);

        if (arg > max - upSlack) throw new IllegalArgumentException(maxMessage);

    }
}
