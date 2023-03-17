package edu.tvv.service;

import java.math.BigInteger;

public class ServiceTdd3bigInt {
    public BigInteger factorialViaBigInteger(int number) {
        BigInteger result = BigInteger.valueOf(1);
        for(int i = 1; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
