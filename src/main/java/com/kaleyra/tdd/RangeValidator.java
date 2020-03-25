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
        if(isMinInclusive) {
            if (arg < min) throw new IllegalArgumentException(arg + " is lower than min range " + min);
        }
        else
            if (arg <= min) throw new IllegalArgumentException(arg + " is lower than min range " + min + " (exclusive)");

        if(isMaxInclusive) {
            if (arg > max) throw new IllegalArgumentException(arg + " is higher than max range " + max);
        }
        else
            if (arg >= max) throw new IllegalArgumentException(arg + " is higher than max range " + max + " (exclusive)");

    }
}
