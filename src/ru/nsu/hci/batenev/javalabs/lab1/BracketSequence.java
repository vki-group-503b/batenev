package ru.nsu.hci.batenev.javalabs.lab1;

import java.util.Scanner;

public class BracketSequence {
    public static void main(String[] args) {
        String bracketSequence = readBracketSequence();
        System.out.println(checkBracketSequence(bracketSequence));
    }

    public static String readBracketSequence() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите скобочную последовательность: ");
        return scan.next();
    }

    public static String checkBracketSequence(String bracketSequence) {
        int openBracket = 0;
        for (int i = 0; i < bracketSequence.length(); i++) {
            switch (bracketSequence.charAt(i)) {
                case '(':
                    openBracket++;
                    break;
                case ')':
                    openBracket--;
                    if (openBracket >= 0) {
                        break;
                    } else {
                        return "Вы ввели неправильную последовательность!";
                    }
            }
        }
        if (openBracket == 0) {
            return "Вы ввели правильную последовательность!";
        } else {
            return "Вы ввели неправильную последовательность!";
        }
    }
}
