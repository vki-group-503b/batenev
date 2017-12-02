package ru.nsu.hci.batenev.javalabs.lab7;

public class Division extends BinaryExpression {
    public Division(Expression f, Expression s) {
        super(f, s);
    }

    @Override
    public double calculate() {
        return first.calculate() / second.calculate();
    }
}
