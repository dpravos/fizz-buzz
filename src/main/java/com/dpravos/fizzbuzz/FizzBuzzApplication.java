package com.dpravos.fizzbuzz;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class FizzBuzzApplication {

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String[] values = fizzBuzz.values();

        Arrays.stream(values).forEach(System.out::println);
    }
}
