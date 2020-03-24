package com.kaleyra.tdd;

import java.util.ArrayList;
import java.util.List;

class Context {
    //private Validator validator;

    private List<Validator> validators = new ArrayList<>();

    //TODO ??? list of validators
//    List<RegistrationRule> rules = new ArrayList<>();

    public void registerValidator(Validator validator) {
        validators.add(validator);
    }

    public void clearValidators(){
        validators.clear();
    }

    /* How to receive only Integer or String arguments  */
    void executeValidation(Object x) {
        for ( Validator v : validators){
            v.validate(x);
        }


//TODO        https://dzone.com/articles/avoiding-many-if-blocks
//        for ( RegistrationRule rule : rules){
//            rule.validate(regData);
//        }

    }

}