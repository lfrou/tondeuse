package com.capgemini;

public class Position {
    private int x;
    private int y;
    private char orientation;

    public Position(int x, int y, char orientation) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    public void rotateRight() {
        orientation = switch (orientation) {
            case 'N' -> 'E';
            case 'E' -> 'S';
            case 'S' -> 'W';
            case 'W' -> 'N';
            default  -> orientation;
        };
    }

    public void rotateLeft() {
        orientation = switch (orientation) {
            case 'N' -> 'W';
            case 'W' -> 'S';
            case 'S' -> 'E';
            case 'E' -> 'N';
            default  -> orientation;
        };
    }

    public void moveForward() {
        switch (orientation) {
            case 'N' -> y += 1;
            case 'E' -> x += 1;
            case 'S' -> y -= 1;
            case 'W' -> x -= 1;

        }
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public char getOrientation() { return orientation; }

    @Override
    public String toString() {
        return x + " " + y + " " + orientation;
    }
}
