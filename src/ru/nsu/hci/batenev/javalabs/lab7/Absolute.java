package ru.nsu.hci.batenev.javalabs.lab7;

public class Absolute extends UnaryExpression {
    public Absolute(Expression f) {
        super(f);
    }

    @Override
    public double calculate() {
        return Math.abs(first.calculate());
    }
}
