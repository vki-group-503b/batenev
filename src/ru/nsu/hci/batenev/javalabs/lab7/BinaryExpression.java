package ru.nsu.hci.batenev.javalabs.lab7;

public abstract class BinaryExpression implements Expression {
    Expression first;
    Expression second;

    BinaryExpression(Expression f, Expression s) {
        first = f;
        second = s;
    }
}
