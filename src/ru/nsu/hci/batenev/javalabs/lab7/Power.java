package ru.nsu.hci.batenev.javalabs.lab7;

public class Power extends BinaryExpression {
    public Power(Expression f, Expression s) {
        super(f, s);
    }

    @Override
    public double calculate() {
        return Math.pow(first.calculate(), second.calculate());
    }
}
