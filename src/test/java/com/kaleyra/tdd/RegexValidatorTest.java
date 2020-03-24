package com.kaleyra.tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class RegexValidatorTest {

    @Test
    public void shouldValidateCorrectly() {

        RegexValidator regexValidator = new RegexValidator("^[A-Za-z0-9+_.-]+@(.+)$");
        regexValidator.validate("lucia@gmail.com");

    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldGiveError() {

        RegexValidator regexValidator = new RegexValidator("^[A-Za-z0-9+_.-]+@(.+)$");
        regexValidator.validate("camilo.gmail.con");

    }
}