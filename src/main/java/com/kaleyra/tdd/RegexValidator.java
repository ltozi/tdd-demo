package com.kaleyra.tdd;

public class RegexValidator implements Validator<String>{

    String regex;

    RegexValidator( String regex){
        this.regex = regex;
    }

    @Override
    public void validate(String type) throws IllegalArgumentException {
        if (!type.matches(regex))
            throw new IllegalArgumentException();

    }
}
