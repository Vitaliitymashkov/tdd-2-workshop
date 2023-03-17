package edu.tvv.service;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

class ServiceTestTdd2long {
    @Test
    public void testFunctionWithLongWhenFactorial12ShouldReturn479001600(){
        int input = 12;
        long expectedOutput = 479001600;

        Service service = new Service();

        long actualOutput = service.factorialLong(input);

        assertThat(actualOutput, Matchers.is(Matchers.equalTo(expectedOutput)));
    }
    @Test
    public void testFunctionWithLongWhenFactorial20ShouldReturn2432902008176640000(){
        int input = 20;
        long expectedOutput = 2432902008176640000L;

        Service service = new Service();

        long actualOutput = service.factorialLong(input);

        assertThat(actualOutput, Matchers.is(Matchers.equalTo(expectedOutput)));
    }
}