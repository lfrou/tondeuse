package com.capgemini;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TondeuseTest {

    @Test
    void testExecuteInstructions1() {
        Pelouse pelouse = new Pelouse(5, 5);
        Position position = new Position(1, 2, 'N');
        Tondeuse tondeuse = new Tondeuse(position, pelouse);
        tondeuse.executeInstructions("GAGAGAGAA");
        assertEquals(1, tondeuse.getPosition().getX());
        assertEquals(3, tondeuse.getPosition().getY());
        assertEquals('N', tondeuse.getPosition().getOrientation());
    }


}