package edu.tvv.service;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

class ServiceTdd1intTest {
    @Test
    public void testFunctionWithIntegerWhenFactorial12ShouldReturn479001600(){
        int input = 12;
        int expectedOutputFor12 = 479001600;
        ServiceTdd1int serviceTdd1int = new ServiceTdd1int();
        int actualOutput = serviceTdd1int.factorialInteger(input);

        MatcherAssert.assertThat(actualOutput, Matchers.is(Matchers.equalTo(expectedOutputFor12)));
    }
}