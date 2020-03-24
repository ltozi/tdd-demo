package com.kaleyra.tdd;

interface Validator<T> {
    void validate(T str) throws IllegalArgumentException;
}








