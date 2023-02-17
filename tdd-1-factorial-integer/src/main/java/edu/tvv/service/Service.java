package edu.tvv.service;

public class Service {
    public int factorialInteger(int number) {
        int result = 1;
        for(int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}
