package ru.nsu.hci.batenev.javalabs.lab3;

import java.util.Scanner;
import java.util.Stack;

public class Calculator {

    public static String readExpression() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        return scan.next();
    }

    public static String toRPN(String expression) {
        Stack<Character> stack = new Stack<>();
        StringBuilder polishEntry = new StringBuilder();
        for (int i = 0; i < expression.length(); i++) {
            switch (priority(expression.charAt(i))) {
                case 0:
                    i = processNumbers(expression, polishEntry, i);
                    break;
                case 1:
                    processBrackets(expression, stack, polishEntry, i);
                    break;
                case 2:
                    processAddition(expression, stack, polishEntry, i);
                    break;
                case 3:
                    processMultiplication(expression, stack, polishEntry, i);
                    break;
                case 4:
                    processExponent(expression, stack, polishEntry, i);
                    break;
            }
        }
        while (!stack.empty()) {
            polishEntry.append(stack.pop()).append(" ");
        }
        return polishEntry.toString();
    }

    private static void processExponent(String expression, Stack<Character> stack, StringBuilder polishEntry, int i) {
        if (stack.empty()) {
            stack.push(expression.charAt(i));
        } else {
            if (priority(stack.peek()) < 4) {
                stack.push(expression.charAt(i));
            } else {
                polishEntry.append(stack.pop()).append(" ");
                stack.push(expression.charAt(i));
            }
        }
    }

    private static void processMultiplication(String expression, Stack<Character> stack, StringBuilder polishEntry, int i) {
        if (stack.empty()) {
            stack.push(expression.charAt(i));
        } else {
            if (priority(stack.peek()) < 3) {
                stack.push(expression.charAt(i));
            } else {
                polishEntry.append(stack.pop()).append(" ");
                stack.push(expression.charAt(i));
            }
        }
        return;
    }

    private static void processAddition(String expression, Stack<Character> stack, StringBuilder polishEntry, int i) {
        if (stack.empty()) {
            stack.push(expression.charAt(i));
        } else {
            if (priority(stack.peek()) < 2) {
                stack.push(expression.charAt(i));
            } else {
                polishEntry.append(stack.pop()).append(" ");
                stack.push(expression.charAt(i));
            }
        }
    }

    private static void processBrackets(String expression, Stack<Character> stack, StringBuilder polishEntry, int i) {
        if (expression.charAt(i) == '(') {
            stack.push(expression.charAt(i));
        } else {
            for (int j = 0; j < stack.search('('); j++) {
                polishEntry.append(stack.pop()).append(" ");
            }
            stack.pop();
        }
    }

    private static int processNumbers(String expression, StringBuilder polishEntry, int i) {
        while (i + 1 < expression.length() && priority(expression.charAt(i + 1)) == 0) {
            polishEntry.append(expression.charAt(i));
            i++;
        }
        polishEntry.append(expression.charAt(i)).append(" ");
        return i;
    }

    public static int priority(char c) {
        switch (c) {
            default:
                return 0;
            case '(':
                return 1;
            case ')':
                return 1;
            case '+':
                return 2;
            case '-':
                return 2;
            case '*':
                return 3;
            case '/':
                return 3;
            case '^':
                return 4;
        }
    }

    public static String calculate(String polishEntry) {
        Stack<Float> stack = new Stack<>();
        StringBuilder buffer = new StringBuilder();
        float first;
        float second;
        for (int i = 0; i < polishEntry.length(); i++) {
            switch (priority(polishEntry.charAt(i))) {
                case 0:
                    if (polishEntry.charAt(i) != ' ') {
                        buffer.append(polishEntry.charAt(i));
                        break;
                    } else {
                        stack.push(Float.valueOf(String.valueOf(buffer)));
                        buffer.delete(0, buffer.length());
                        break;
                    }
                case 2:
                    second = stack.pop();
                    first = stack.pop();
                    if (polishEntry.charAt(i) == '+') {
                        stack.push(first + second);
                    } else {
                        stack.push(first - second);
                    }
                    i++;
                    break;
                case 3:
                    second = stack.pop();
                    first = stack.pop();
                    if (polishEntry.charAt(i) == '*') {
                        stack.push(first * second);
                    } else {
                        stack.push(first / second);
                    }
                    i++;
                    break;
                case 4:
                    second = stack.pop();
                    first = stack.pop();
                    stack.push((float) Math.pow(first, second));
                    i++;
                    break;
            }
        }
        return String.valueOf(stack.pop());
    }
}
