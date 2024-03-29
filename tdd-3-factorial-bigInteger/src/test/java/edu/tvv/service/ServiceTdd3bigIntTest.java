package edu.tvv.service;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

class ServiceTdd3bigIntTest {

    @Test
    public void testFunctionWithBigIntegerWhenFactorial12ShouldReturn479001600(){
        int input = 12;
        BigInteger expectedOutputFor12 = BigInteger.valueOf(479001600);
        ServiceTdd3bigInt serviceTdd3bigInt = new ServiceTdd3bigInt();
        BigInteger actualOutput = serviceTdd3bigInt.factorialViaBigInteger(input);

        MatcherAssert.assertThat(actualOutput, Matchers.is(Matchers.equalTo(expectedOutputFor12)));
    }

    @Test
    public void testFunctionWithBigIntegerWhenFactorial20ShouldReturn2432902008176640000(){
        int input = 20;
        BigInteger expectedOutputFor20 = BigInteger.valueOf(2_432_902_008_176_640_000L);
        ServiceTdd3bigInt serviceTdd3bigInt = new ServiceTdd3bigInt();
        BigInteger actualOutput = serviceTdd3bigInt.factorialViaBigInteger(input);

        MatcherAssert.assertThat(actualOutput, Matchers.is(Matchers.equalTo(expectedOutputFor20)));
    }

    @Test
    public void testFunctionWithIntegerWhenFactorial50ShouldReturn30_414_093_201_713_378_043_612_608_166_064_768_844_377_641_568_960_512_000_000_000_000(){
        int input = 50;
        BigInteger expectedOutputFor50 = new BigInteger("30414093201713378043612608166064768844377641568960512000000000000");
        ServiceTdd3bigInt serviceTdd3bigInt = new ServiceTdd3bigInt();
        BigInteger actualOutput = serviceTdd3bigInt.factorialViaBigInteger(input);

        MatcherAssert.assertThat(actualOutput, Matchers.is(Matchers.equalTo(expectedOutputFor50)));
    }
}