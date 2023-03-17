package edu.tvv.service;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;

class ServiceTdd1intWithChecksTest {
    @Test
    public void testFunctionWithIntegerWhenFactorial12ShouldReturn479001600(){
        int input = 12;
        int expectedOutputFor12 = 479001600;
        ServiceTdd1intWithChecks serviceTdd1intWithChecks = new ServiceTdd1intWithChecks();
        int actualOutput = serviceTdd1intWithChecks.factorialInteger(input);

        assertThat(actualOutput, Matchers.is(Matchers.equalTo(expectedOutputFor12)));
    }

    @Test
    public void testFunctionWithIntegerWhenFactorial121ShouldReturnException(){
        int input = 121;
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ServiceTdd1intWithChecks serviceTdd1intWithChecks = new ServiceTdd1intWithChecks();
            serviceTdd1intWithChecks.factorialInteger(input);
        });
    }

}