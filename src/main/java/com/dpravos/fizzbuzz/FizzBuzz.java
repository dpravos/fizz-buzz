package com.dpravos.fizzbuzz;

public class FizzBuzz {
    public String[] values() {
        String[] values = new String[100];
        for (int i = 0; i < values.length; i++) {
            values[i] = value(i + 1);
        }
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
