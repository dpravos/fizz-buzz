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
}
