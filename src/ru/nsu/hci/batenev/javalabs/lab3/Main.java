package ru.nsu.hci.batenev.javalabs.lab3;

public class Main {
    public static void main(String[] args) {

        String expression = Calculator.readExpression();
        String polishEntry = Calculator.toRPN(expression);

        System.out.println("Польская запись: " + polishEntry);
        System.out.println("Результат: " + Calculator.calculate(polishEntry));
    }

}
