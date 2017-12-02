package ru.nsu.hci.batenev.javalabs.lab6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    @Test
    void check_pointTwo_coordinates() {
        PointTwo p = new PointTwo(1, 2);
        assertEquals(1, p.getX());
        assertEquals(2, p.getY());
    }

    @Test
    void check_pointTwo_distance() {
        PointTwo p1 = new PointTwo(1, 2);
        PointTwo p2 = new PointTwo(1, 4);
        assertEquals(2, p1.distance(p2));
    }

    @Test
    void check_pointTwo_oneLine() {
        PointTwo p1 = new PointTwo(1, 2);
        PointTwo p2 = new PointTwo(2, 3);
        PointTwo p3 = new PointTwo(3, 4);
        assertEquals(true, p1.isOneLine(p2, p3));
    }

    @Test
    void check_pointTwo_angle() {
        PointTwo p = new PointTwo(1, 2);
        assertEquals(1.1071487177940904, p.angle());
    }

    @Test
    void check_pointThree_coordinates() {
        PointThree p = new PointThree(1, 2, 3);
        assertEquals(1, p.getX());
        assertEquals(2, p.getY());
        assertEquals(3, p.getZ());
    }

    @Test
    void check_pointThree_distance() {
        PointThree p1 = new PointThree(1, 2, 3);
        PointThree p2 = new PointThree(1, 2, 6);
        assertEquals(3, p1.distance(p2));
    }

    @Test
    void check_pointThree_oneLine() {
        PointThree p1 = new PointThree(1, 2, 3);
        PointThree p2 = new PointThree(4, 5, 6);
        PointThree p3 = new PointThree(7, 8, 9);
        assertEquals(true, p1.isOneLine(p2, p3));
    }

    @Test
    void check_pointThree_onePlane() {
        PointThree p1 = new PointThree(1, 2, 3);
        PointThree p2 = new PointThree(4, 5, 6);
        PointThree p3 = new PointThree(7, 8, 9);
        PointThree p4 = new PointThree(10, 11, 12);
        assertEquals(true, p1.isOnePlane(p2, p3, p4));
    }
}