package com.kaleyra.tdd;

public class RangeValidator<Integer> implements Validator<Integer> {

    private int min;
    private int max;

    RangeValidator (int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public void validate(Integer str) throws IllegalArgumentException {
        int x = (int) str;
        if ( x < min || x > max )
            throw new IllegalArgumentException();
    }

}
