package service;

import edu.tvv.service.ServiceTdd1intWithNonRelevantAssertions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ServiceTdd1intWithNonRelevantAssertionsTest {
    @Test
    public void testFunctionWithIntegerWhenFactorial12ShouldReturn479001600(){
        int input = 12;
        int expectedOutputFor12 = 479001600;
        ServiceTdd1intWithNonRelevantAssertions serviceTdd1intWithNonRelevantAssertions = new ServiceTdd1intWithNonRelevantAssertions();
        int actualOutput = serviceTdd1intWithNonRelevantAssertions.factorialInteger(input);
//        DISABLED INTENTIONALLY TO SHOW THAT TEST DOES NOT HAVE ANY ASSERTIONS
//        assertThat(actualOutput, Matchers.is(Matchers.equalTo(expectedOutputFor12)));
    }

    @Test
    public void testFunctionWithIntegerWhenFactorial121ShouldReturnException(){
        int input = 121;
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            // REPLACED WITH WRONG ASSERTION INTENTIONALLY
            new ServiceTdd1intWithNonRelevantAssertions().factorialInteger(input);
            throw new IllegalArgumentException("Number is not in allowed range");
        });
    }

}