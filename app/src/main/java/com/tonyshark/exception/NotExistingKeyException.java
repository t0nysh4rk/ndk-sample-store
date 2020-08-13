package com.tonyshark.exception;

public class NotExistingKeyException extends Exception {
    public NotExistingKeyException(String pDetailMessage) {
        super(pDetailMessage);
    }
}
