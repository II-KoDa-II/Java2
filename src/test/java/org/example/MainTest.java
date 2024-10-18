package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void inputFilter() {
        assertTrue(Main.inputFilter("1"));
        assertFalse(Main.inputFilter("a"));
    }

}