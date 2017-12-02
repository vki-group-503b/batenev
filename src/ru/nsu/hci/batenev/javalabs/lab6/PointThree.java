package ru.nsu.hci.batenev.javalabs.lab6;

public class PointThree extends PointTwo {
    private double z;

    public PointThree(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public double distance(PointThree pointThree) {
        return Math.sqrt(((pointThree.getX() - this.getX()) * (pointThree.getX() - this.getX())) +
                         ((pointThree.getY() - this.getY()) * (pointThree.getY() - this.getY())) +
                         ((pointThree.getZ() - this.getZ()) * (pointThree.getZ() - this.getZ())));
    }

    public boolean isOneLine(PointThree p2, PointThree p3) {
        if (getY() * (p2.getZ() - p3.getZ()) + p2.getY() * (p3.getZ() - getZ()) + p3.getY() * (getZ() - p2.getZ()) +
            getZ() * (p2.getX() - p3.getX()) + p2.getZ() * (p3.getX() - getX()) + p3.getZ() * (getX() - p2.getX()) +
            getX() * (p2.getY() - p3.getY()) + p2.getX() * (p3.getY() - getY()) + p3.getX() * (getY() - p2.getY()) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isOnePlane(PointThree p2, PointThree p3, PointThree p4) {
        PointThree vAB = new PointThree((p2.getX() - getX()), (p2.getY() - getY()), (p2.getZ() - getZ()));
        PointThree vAC = new PointThree((p3.getX() - getX()), (p3.getY() - getY()), (p3.getZ() - getZ()));
        PointThree vAD = new PointThree((p4.getX() - getX()), (p4.getY() - getY()), (p4.getZ() - getZ()));
        if ((vAB.getX() * (((vAC.getY() - (vAC.getX() * (vAB.getY() / vAB.getX()))) *
                            (vAD.getZ() - (vAD.getX() * (vAB.getZ() / vAB.getX())))) -
                           ((vAC.getZ() - (vAC.getX() * (vAB.getZ() / vAB.getX()))) *
                            (vAD.getY() - (vAD.getX() * (vAB.getZ() / vAB.getX())))))) == 0d) {
            return true;
        } else {
            return false;
        }
    }
}
