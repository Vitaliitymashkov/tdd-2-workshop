package edu.tvv.service;

public class Service {
    public long factorialLong(int number) {
        long result = 1;
        for(int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}
