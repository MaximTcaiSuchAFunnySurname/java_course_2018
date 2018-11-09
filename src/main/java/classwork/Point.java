 package com.company;

public class Point {
    static double x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void coordinatesReturn() {
        System.out.println("(x,y) is " + "(" + x + "," + y + ")");
    }

    public void add(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void addX(double x) {
        this.x = x;
    }

    public void addY(double y) {
        this.y = y;
    }

    public double distanceReturn() {
        return Math.sqrt(x*x+y*y);
    }
}
