package ru.nsu.hci.batenev.javalabs.lab7;

public class Addition extends BinaryExpression {
    public Addition(Expression f, Expression s) {
        super(f, s);
    }

    @Override
    public double calculate() {
        return first.calculate() + second.calculate();
    }
}
