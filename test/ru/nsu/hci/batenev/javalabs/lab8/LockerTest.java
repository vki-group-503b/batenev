package ru.nsu.hci.batenev.javalabs.lab8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LockerTest {
    @Test
    void locker_init_value() {
        Locker locker = new Locker();
        assertEquals(0, locker.variable);
    }

    @Test
    void locker_sets_value() throws LockerLockedException {
        Locker locker = new Locker();
        locker.setValue(12);
        assertEquals(12, locker.variable);
    }

    @Test
    void locker_gets_value() throws LockerLockedException {
        Locker locker = new Locker(5);
        assertEquals(5, locker.getValue());
    }

    @Test
    void locker_fails_when_trying_to_setValue_on_locked_locker() {
        Locker locker = new Locker();
        locker.lock();
        assertThrows(LockerLockedException.class, () -> locker.setValue(5));
    }

    @Test
    void lock_then_set_value_then_unlock_set_value() throws LockerLockedException {
        Locker locker = new Locker();
        locker.lock();
        assertThrows(LockerLockedException.class, () -> locker.setValue(5));
        locker.unlock();
        locker.setValue(5);
        assertEquals(5, locker.variable);
    }
}