package ru.nsu.hci.batenev.javalabs.lab7;

public class Multiplication extends BinaryExpression {
    public Multiplication(Expression f, Expression s) {
        super(f, s);
    }

    @Override
    public double calculate() {
        return first.calculate() * second.calculate();
    }
}
