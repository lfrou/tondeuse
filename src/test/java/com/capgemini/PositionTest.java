package com.capgemini;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PositionTest {

    @Test
    void testMoveForwardNorth() {
        Position position = new Position(0, 0, 'N');
        position.moveForward();
        assertEquals(0, position.getX());
        assertEquals(1, position.getY());
        assertEquals('N', position.getOrientation());
    }

    @Test
    void testRotateRight() {
        Position position = new Position(0, 0, 'N');
        position.rotateRight();
        assertEquals('E', position.getOrientation());
    }

    @Test
    void testRotateLeft() {
        Position position = new Position(0, 0, 'N');
        position.rotateLeft();
        assertEquals('W', position.getOrientation());
    }
}