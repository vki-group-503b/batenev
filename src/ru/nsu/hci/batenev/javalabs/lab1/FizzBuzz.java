package ru.nsu.hci.batenev.javalabs.lab1;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(checkFizzBuzz(i));
        }
    }

    public static String checkFizzBuzz(int i) {
        if ((i % 3 == 0) & (i % 5 == 0)) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(i);
    }
}
