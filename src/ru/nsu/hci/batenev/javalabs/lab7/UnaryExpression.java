package ru.nsu.hci.batenev.javalabs.lab7;

public abstract class UnaryExpression implements Expression{
    Expression first;

    UnaryExpression(Expression f) {
        first = f;
    }
}
