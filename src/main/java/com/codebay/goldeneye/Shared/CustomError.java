package com.codebay.goldeneye.Shared;

public class CustomError extends RuntimeException {

    private final String errorCode;
    private final String errorMessage;

    public CustomError(String errorCode, String errorMessage) {
        super(errorMessage);

        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String errorCode() {
        return errorCode;
    }

    public String errorMessage() {
        return errorMessage;
    }

}
