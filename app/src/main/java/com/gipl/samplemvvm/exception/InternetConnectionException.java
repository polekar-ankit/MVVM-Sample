package com.gipl.samplemvvm.exception;

/**
 * Exception throw by the application when a there is a network connection exception.
 */
public class InternetConnectionException extends Exception {

    public InternetConnectionException() {
        super();
    }

    public InternetConnectionException(final Throwable cause) {
        super(cause);
    }
}
