package com.dpravos.fizzbuzz;

public class FizzBuzz {
    public String value(int number) {
        if (isFizz(number)) {
            return "Fizz";
        }

        return String.valueOf(number);
    }

    private boolean isFizz(int number) {
        return number % 3 == 0;
    }
}
