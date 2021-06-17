package com.dpravos.fizzbuzz;

public class FizzBuzz {
    public String value(int number) {
        if (number == 3 || number == 6 || number == 9) {
            return "Fizz";
        }

        return String.valueOf(number);
    }
}
