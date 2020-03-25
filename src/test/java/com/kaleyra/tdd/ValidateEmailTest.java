package com.kaleyra.tdd;

import org.junit.Test;


public class ValidateEmailTest {

    @Test
    public void shouldValidateCorrectEmailFormat() {

        //Arrange
        ValidateEmail validateEmail = new ValidateEmail();

        //Act
        validateEmail.validate("daniele_commodaro@live.it");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldValidateNotEmpty() {
        //Arrange
        ValidateEmail notEmptyValidator = new ValidateEmail();

        //Act
        notEmptyValidator.validate("not_valid_mail");

        //Assert
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldGiveErrorIfMissingLastPart() {
        //Arrange
        ValidateEmail notEmptyValidator = new ValidateEmail();

        //Act
        notEmptyValidator.validate("name.surname@");

        //Assert
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldGiveErrorBecauseOfNumbersInTheLastPart() {
        //Arrange
        ValidateEmail notEmptyValidator = new ValidateEmail();

        //Act
        notEmptyValidator.validate("@yahoo.com");

        //Assert
    }


}
