package ru.nsu.hci.batenev.javalabs.lab2;

import java.util.Arrays;

public class ArrayContainer {
    public int[] numbers;

    public ArrayContainer(int[] numbers) {
        this.numbers = numbers.clone();
        Arrays.sort(numbers);
    }

    public String min() {
        return String.valueOf(numbers[0]);
    }

    public String max() {
        return String.valueOf(numbers[numbers.length - 1]);
    }

    public String average() {
        int avg = 0;
        for (int i : numbers) {
            avg += i;
        }
        return String.valueOf((float) avg / numbers.length);
    }

    public String median() {
        if (numbers.length % 2 == 0) {
            return String.valueOf((float) ((numbers[numbers.length / 2] + numbers[numbers.length / 2 - 1]) / 2.0));
        } else {
            return String.valueOf(numbers[numbers.length / 2]);
        }
    }

    public String geometricMean() {
        int comp = 1;
        for (int i : numbers) {
            comp *= i;
        }
        return String.valueOf((float) Math.exp(Math.log(comp) / numbers.length));
    }
}
