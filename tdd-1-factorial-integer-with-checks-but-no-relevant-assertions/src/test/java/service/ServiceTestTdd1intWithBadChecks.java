package service;

import edu.tvv.service.Service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ServiceTestTdd1intWithBadChecks {
    @Test
    public void testFunctionWithIntegerWhenFactorial12ShouldReturn479001600(){
        int input = 12;
        int expectedOutputFor12 = 479001600;
        Service service = new Service();
        int actualOutput = service.factorialInteger(input);
//        DISABLED INTENTIONALLY
//        assertThat(actualOutput, Matchers.is(Matchers.equalTo(expectedOutputFor12)));
    }

    @Test
    public void testFunctionWithIntegerWhenFactorial121ShouldReturnException(){
        int input = 121;
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            // REPLACED WITH WRONG ASSERTION INTENTIONALLY
            throw new IllegalArgumentException("Number is not in allowed range");
        });
    }

}