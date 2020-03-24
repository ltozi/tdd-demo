package com.kaleyra.tdd;

class NotEmptyValidator implements Validator<String> {

    public void validate(String str) throws IllegalArgumentException {
        if (str == null || str.isEmpty())
            throw new IllegalArgumentException();
    }
}