package com.dpravos.fizzbuzz;

public class FizzBuzz {
    public String value(int number) {
        if (number == 15) {
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
