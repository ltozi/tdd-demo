package com.kaleyra.tdd;

class NotNullValidator implements Validator<String> {

    public void validate(String str) throws IllegalArgumentException {
        if (str == null)
            throw new IllegalArgumentException();
    }
}