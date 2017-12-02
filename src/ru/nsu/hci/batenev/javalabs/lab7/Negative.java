package ru.nsu.hci.batenev.javalabs.lab7;

public class Negative extends UnaryExpression {
    public Negative(Expression f) {
        super(f);
    }

    @Override
    public double calculate() {
        return - first.calculate();
    }
}
