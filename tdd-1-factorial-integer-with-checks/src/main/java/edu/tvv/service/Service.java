package edu.tvv.service;

public class Service {
    public int factorialInteger(int number) {
        if (number <= 0 || number > 12) {
            throw new IllegalArgumentException("Number is not in allowed range");
        }
        int result = 1;
        for(int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}
