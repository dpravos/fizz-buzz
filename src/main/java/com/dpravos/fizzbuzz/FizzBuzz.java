package com.dpravos.fizzbuzz;

public class FizzBuzz {
    public String[] values() {
        String[] values = new String[100];
        values[0] = value(1);
        values[1] = value(2);
        values[3] = value(4);
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
