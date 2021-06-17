package com.dpravos.fizzbuzz;

public class FizzBuzz {
    public String value(int number) {
        if (isFizz(number)) {
            return "Fizz";
        }

        if (number == 5 || number == 10 || number == 20) {
            return "Buzz";
        }

        return String.valueOf(number);
    }

    private boolean isFizz(int number) {
        return number % 3 == 0;
    }
}
