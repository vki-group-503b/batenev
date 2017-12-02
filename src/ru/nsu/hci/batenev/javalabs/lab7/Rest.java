package ru.nsu.hci.batenev.javalabs.lab7;

public class Rest extends BinaryExpression {
    public Rest(Expression f, Expression s) {
        super(f, s);
    }

    @Override
    public double calculate() {
        return first.calculate() % second.calculate();
    }
}
