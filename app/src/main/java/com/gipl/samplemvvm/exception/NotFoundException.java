package com.gipl.samplemvvm.exception;

/**
 * Exception throw by the application when a User search can't return a valid result.
 */
public class NotFoundException extends Exception {
    public NotFoundException() {
        super();
    }

    public NotFoundException(Throwable cause) {
        super(cause);
    }
}

