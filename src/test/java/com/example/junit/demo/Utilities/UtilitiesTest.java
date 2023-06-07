package com.example.junit.demo.Utilities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilitiesTest {

    @Test
    void exist() {
        Utilities utilities = new Utilities();
        assertTrue(utilities.exist("Walter"));
    }

    @Test
    void existFalse() {
        Utilities utilities = new Utilities();
        assertFalse(utilities.exist("Fernando"));
    }
}