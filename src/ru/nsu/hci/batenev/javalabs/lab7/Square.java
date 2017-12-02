package ru.nsu.hci.batenev.javalabs.lab7;

public class Square extends UnaryExpression {
    public Square(Expression f) {
        super(f);
    }

    @Override
    public double calculate() {
        return first.calculate() * first.calculate();
    }
}
