package com.dpravos.fizzbuzz;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzShould {

    @ParameterizedTest
    @CsvSource({"1,1", "2,2", "4,4"})
    void return_number_when_number_is_not_multiple_of_3_nor_of_5(int number, String expectedValue) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String value = fizzBuzz.value(number);

        assertEquals(expectedValue, value);
    }
}
