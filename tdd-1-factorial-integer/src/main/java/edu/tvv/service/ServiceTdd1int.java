package edu.tvv.service;

public class ServiceTdd1int {
    public int factorialInteger(int number) {
        int result = 1;
        for(int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}
