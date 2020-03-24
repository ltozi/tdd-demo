package com.kaleyra.tdd;

class ValidateAge implements Validator<String> {
    public void validate(String str) throws IllegalArgumentException {
        int age = Integer.parseInt(str);

        if (age < 18 || age < 0)
            throw new IllegalArgumentException("Age must be greater than 18");

    }
}