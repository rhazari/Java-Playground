package com.raihan.concurrency.basic.callable;

import java.security.InvalidParameterException;
import java.util.concurrent.Callable;

public class FactorialTask implements Callable<Integer> {
    int number;

    public FactorialTask(int number) {
        this.number = number;
    }

    public Integer call() throws InvalidParameterException {
        int fact = 1;
        if (number < 0){
            throw new InvalidParameterException("Number must be positive");
        }

        for(int k = number; k > 1; k--){
           fact *= k;
        }
        return fact;
    }

    private class InvalidParameterException extends Exception {
        public InvalidParameterException(String msg) {
            super(msg);
        }
    }
}
