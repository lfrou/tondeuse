package com.capgemini;

public class Pelouse {
    private int limX;
    private int limY;
    public Pelouse(int limX, int limY) {
        this.limX = limX;
        this.limY = limY;
    }

    public boolean isPositionValid(int x, int y, char orientation) {
        switch (orientation) {
            case 'N':
                return y + 1 <= limY;
            case 'E':
                return x + 1 <= limX;
            case 'S':
                return y - 1 >= 0;
            case 'W':
                return x - 1 >= 0;
        }
        return true;
    }
}