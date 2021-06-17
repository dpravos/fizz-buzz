package com.dpravos.fizzbuzz;

import java.util.Arrays;

public class FizzBuzz {
    public String[] values() {
        String[] values = new String[100];
        Arrays.setAll(values, i -> value(i + 1));
        return values;
    }

    public String value(int number) {
        if (isFizz(number) && isBuzz(number)) {
            return "FizzBuzz";
        }

        if (isFizz(number)) {
            return "Fizz";
        }

        if (isBuzz(number)) {
            return "Buzz";
        }

        return String.valueOf(number);
    }

    private boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    private boolean isFizz(int number) {
        return number % 3 == 0;
    }
}
