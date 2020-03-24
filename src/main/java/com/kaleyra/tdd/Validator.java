package com.kaleyra.tdd;

interface Validator<T> {
    void validate(T type) throws IllegalArgumentException;
}








