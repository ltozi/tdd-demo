package com.kaleyra.tdd;

import org.junit.Test;

public class RangeValidatorTest {

    @Test
    public void shouldValidateCorrectly() {

        RangeValidator rangeValidator = new RangeValidator(18, 65);
        rangeValidator.validate(23);

    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldGiveErrorWhenUnderMinAge() {

        RangeValidator rangeValidator = new RangeValidator(18, 120);
        rangeValidator.validate(15);

    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldGiveErrorWhenOverMaxAge() {

        RangeValidator rangeValidator = new RangeValidator(18, 35);
        rangeValidator.validate(42);

    }

}