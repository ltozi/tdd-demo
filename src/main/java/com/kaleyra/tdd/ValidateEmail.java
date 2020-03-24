package com.kaleyra.tdd;

class ValidateEmail implements Validator<String> {
    public void validate(String str) throws IllegalArgumentException {

        if (!str.matches("^[A-Za-z0-9+_.-]+@(.+)$"))
            throw new IllegalArgumentException("Should not be null");
    }
}