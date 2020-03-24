package com.kaleyra.tdd;

import org.junit.Test;


public class ValidateEmailTest {

    @Test
    public void shouldValidateNotEmpty() {
        //Arrange
        NotEmptyValidator notEmptyValidator = new NotEmptyValidator();

        //Act
        notEmptyValidator.validate("NOT_EMPTY_STRING");

        //Assert
    }

    @Test
    public void shouldValidateCorrectEmailFormat() {

        //Arrange
        ValidateEmail validateEmail = new ValidateEmail();

        //Act
        validateEmail.validate("daniele_commodaro@live.it");
    }
}
