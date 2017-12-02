package ru.nsu.hci.batenev.javalabs.lab1;

import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        int number = readNumber();
        System.out.println(checkNaturalNumber(number));
    }

    public static int readNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        return scan.nextInt();
    }

    public static String checkNaturalNumber(int number) {
        if (number > 0) {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    return "Число не натуральное!";
                }
            }
            return "Число натуральное!";
        } else {
            return "Число не натуральное!";
        }
    }
}
