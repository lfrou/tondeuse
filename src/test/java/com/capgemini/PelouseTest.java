package com.capgemini;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PelouseTest {

    @Test
    void testIsPositionValid() {
        Pelouse pelouse = new Pelouse(5, 5);
        assertTrue(pelouse.isPositionValid(3, 3, 'N'));
        assertFalse(pelouse.isPositionValid(5, 5, 'N'));
    }
}