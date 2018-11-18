package classwork.util;

public class Point {
    double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void coordinates() {
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

    public double distance() {
        return Math.sqrt(x * x + y * y);
    }
}