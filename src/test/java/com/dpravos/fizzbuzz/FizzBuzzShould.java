package com.dpravos.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzShould {

    @ParameterizedTest
    @CsvSource({"1,1", "2,2", "4,4"})
    void return_number_when_number_is_not_multiple_of_3_nor_of_5(int number, String expectedValue) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String value = fizzBuzz.value(number);

        assertEquals(expectedValue, value);
    }

    @ParameterizedTest
    @ValueSource( ints = {3, 6, 9})
    void return_fizz_when_number_is_multiple_of_3(int number) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String value = fizzBuzz.value(number);

        assertEquals("Fizz", value);
    }

    @ParameterizedTest
    @ValueSource( ints = {5, 10, 20})
    void return_buzz_when_number_is_multiple_of_5(int number) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String value = fizzBuzz.value(number);

        assertEquals("Buzz", value);
    }

    @Test
    void return_fizzbuzz_when_number_is_15() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String value = fizzBuzz.value(15);

        assertEquals("FizzBuzz", value);
    }
}
