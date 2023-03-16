package com.softserve.edu08.sticc;

public class Shape {
    String type;
    Coordinate[] coordinates;

    public static class Coordinate {
        int x;
        int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public String toString() {
            return "x = " + x + " y = " + y;
        }
    }
}