package ru.nsu.hci.batenev.javalabs.lab6;

public class PointTwo {
    private double x;
    private double y;

    public PointTwo(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(PointTwo pointTwo) {
        return Math.sqrt(((pointTwo.getX() - this.getX()) * (pointTwo.getX() - this.getX())) +
                         ((pointTwo.getY() - this.getY()) * (pointTwo.getY() - this.getY())));
    }

    public double angle() {
        return Math.atan(y / x);
    }

    public boolean isOneLine(PointTwo p2, PointTwo p3) {
        return ((p3.getX() * (p2.getY() - getY()) -
                 p3.getY() * (p2.getX() - getX())) == (getX() * p2.getY() - p2.getX() * getY()));
    }
}
