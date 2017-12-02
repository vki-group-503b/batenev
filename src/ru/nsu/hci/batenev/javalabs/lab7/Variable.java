package ru.nsu.hci.batenev.javalabs.lab7;

public class Variable implements Expression{
    double variable;

    public Variable(double v) {
        variable = v;
    }

    @Override
    public double calculate() {
        return variable;
    }
}
