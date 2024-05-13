package com.capgemini;

public class Tondeuse {
    private Position position;
    private Pelouse pelouse;
    public Tondeuse(Position position, Pelouse pelouse) {
        this.position = position;
        this.pelouse = pelouse;
    }

    public void executeInstructions(String instructions) {
        for (char instruction : instructions.toCharArray()) {
            switch (instruction) {
                case 'D':
                    position.rotateRight();
                    break;
                case 'G':
                    position.rotateLeft();
                    break;
                case 'A':
                    if (pelouse.isPositionValid(position.getX(), position.getY(), position.getOrientation())) {
                        position.moveForward();
                    }
                    break;
            }
        }
    }

    public Position getPosition() {
        return position;
    }
}