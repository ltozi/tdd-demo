package com.kaleyra.tdd;

import org.junit.Test;

public class NotEmptyValidatorTest {

    @Test
    public void shouldValidateCorrectly() {
        //Arrange
        NotEmptyValidator notEmptyValidator = new NotEmptyValidator();

        //Act
        notEmptyValidator.validate("NOT_EMPTY_STRING");

        //Assert
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldGiveErrorWhenNullInput() {
        //Arrange
        NotEmptyValidator notEmptyValidator = new NotEmptyValidator();

        //Act
        notEmptyValidator.validate(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldGiveErrorWhenEmpty() {
        //Arrange
        NotEmptyValidator notEmptyValidator = new NotEmptyValidator();
        //Act
        notEmptyValidator.validate("");
    }
}