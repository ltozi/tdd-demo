package com.kaleyra.tdd;

class Context {
    private Validator validator;

    public void setValidator(Validator validator) {
        this.validator = validator;
    }

    void executeValidation(String str) {
        validator.validate(str);
    }

}