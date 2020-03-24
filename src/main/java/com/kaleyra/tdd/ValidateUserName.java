package com.kaleyra.tdd;

class ValidateUserName implements Validator<String> {
    public void validate(String str) throws IllegalArgumentException {
        if (str.equals(null) || !str.matches("[a-z]{10}"))
            throw new IllegalArgumentException("Should not be null");
    }
}