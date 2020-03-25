package com.kaleyra.tdd;

import java.util.logging.Logger;

class ValidateEmail implements Validator<String> {

    public void validate(String str) throws IllegalArgumentException {
        if (!str.matches("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")) {
            throw new IllegalArgumentException("Invalid mail format: " + str + " - Expected something like name@domain.com");
        }
    }
}