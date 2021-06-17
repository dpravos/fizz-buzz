package com.dpravos.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzShould {

    @Test
    void return_1_when_number_is_1() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String value = fizzBuzz.value(1);

        assertEquals("1", value);
    }

    @Test
    void return_2_when_number_is_2() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String value = fizzBuzz.value(2);

        assertEquals("2", value);
    }

    @Test
    void return_4_when_number_is_4() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String value = fizzBuzz.value(4);

        assertEquals("4", value);
    }
}
