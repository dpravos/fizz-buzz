package com.dpravos.fizzbuzz;

public class FizzBuzz {
    public String value(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }

        return String.valueOf(number);
    }
}
