package ru.nsu.hci.batenev.javalabs.lab7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressionTest {
    @Test
    void check_absolute() {
        assertEquals(10, new Absolute(new Variable(-10)).calculate());
    }

    @Test
    void check_addition() {
        assertEquals(10, new Addition(new Variable(5), new Variable(5)).calculate());
    }

    @Test
    void check_division() {
        assertEquals(10, new Division(new Variable(100), new Variable(10)).calculate());
    }

    @Test
    void check_multiplication() {
        assertEquals(10, new Multiplication(new Variable(2), new Variable(5)).calculate());
    }

    @Test
    void check_negative() {
        assertEquals(10, new Negative(new Variable(-10)).calculate());
    }

    @Test
    void check_power() {
        assertEquals(9765625, new Power(new Variable(5), new Variable(10)).calculate());
    }

    @Test
    void check_rest() {
        assertEquals(10, new Rest(new Variable(10), new Variable(11)).calculate());
    }

    @Test
    void check_square() {
        assertEquals(4, new Square(new Variable(2)).calculate());
    }

    @Test
    void check_subtraction() {
        assertEquals(10, new Subtraction(new Variable(15), new Variable(5)).calculate());
    }
}