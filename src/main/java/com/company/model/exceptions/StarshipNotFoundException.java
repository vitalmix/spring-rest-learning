package com.company.model.exceptions;

public class StarshipNotFoundException extends RuntimeException {

    public StarshipNotFoundException(String message) {
        super(message);
    }
}
