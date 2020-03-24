package com.kaleyra.tdd;

public interface Validator<T> {
    public void validate(T type) throws IllegalArgumentException;
}








