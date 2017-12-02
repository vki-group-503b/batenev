package ru.nsu.hci.batenev.javalabs.lab2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите желаемое кол-во чисел: ");
        int[] numbers = new int[scan.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Введите " + (i + 1) + "-е число: ");
            numbers[i] = scan.nextInt();
        }

        ArrayContainer setOfNumbers = new ArrayContainer(numbers);

        System.out.println("Минимальное число: " + setOfNumbers.min());
        System.out.println("Максимальное число: " + setOfNumbers.max());
        System.out.println("Среднее арифметическое: " + setOfNumbers.average());
        System.out.println("Медиана: " + setOfNumbers.median());
        System.out.println("Среднее геометрическое: " + setOfNumbers.geometricMean());
    }
}
