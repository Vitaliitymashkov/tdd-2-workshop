package edu.tvv.service;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

class ServiceTest {
    @Test
    public void testFunctionWithIntegerWhenFactorial12ShouldReturn479001600(){
        int input = 12;
        int expectedOutputFor12 = 479001600;
        Service service = new Service();
        int actualOutput = service.factorialInteger(input);

        MatcherAssert.assertThat(actualOutput, Matchers.is(Matchers.equalTo(expectedOutputFor12)));
    }
}