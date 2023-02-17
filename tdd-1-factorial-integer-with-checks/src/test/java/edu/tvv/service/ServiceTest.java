package edu.tvv.service;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;

class ServiceTest {
    @Test
    public void testFunctionWithIntegerWhenFactorial12ShouldReturn479001600(){
        int input = 12;
        int expectedOutputFor12 = 479001600;
        Service service = new Service();
        int actualOutput = service.factorialInteger(input);

        assertThat(actualOutput, Matchers.is(Matchers.equalTo(expectedOutputFor12)));
    }

    @Test
    public void testFunctionWithIntegerWhenFactorial121ShouldReturnException(){
        int input = 121;
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Service service = new Service();
            service.factorialInteger(input);
        });
    }

}