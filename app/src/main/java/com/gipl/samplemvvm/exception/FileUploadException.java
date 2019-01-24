package com.gipl.samplemvvm.exception;

/**
 * Created by suhaspalkar on 01-Oct-2018.
 */
public class FileUploadException extends Exception {

    public FileUploadException() {
        super();
    }

    public FileUploadException(String message) {
        super(message);
    }

    public FileUploadException(Throwable cause) {
        super(cause);
    }
}
