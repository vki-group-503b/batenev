package ru.nsu.hci.batenev.javalabs.lab8;

public class Locker {
    public int variable;
    public boolean lock;

    public Locker() {
        variable = 0;
        lock = false;
    }

    public Locker(int v) {
        variable = v;
        lock = false;
    }

    public void setValue(int variable) throws LockerLockedException {
        if (!lock) {
            this.variable = variable;
        } else {
            throw new LockerLockedException("Variable is blocked!");
        }
    }

    public int getValue() {
        return variable;
    }

    public void lock() {
        lock = true;
    }

    public void unlock() {
        lock = false;
    }
}
