package classwork;

public class Point {

    static double x;
    static double y;

    public Point(int x, int y) {
        x = (double)x;
        y = (double)y;
    }

    public void coordinatesReturn() {
        System.out.println("(x,y) is (" + x + "," + y + ")");
    }

    public void add(double x, double y) {
        x = x;
        y = y;
    }

    public void addX(double x) {
        x = x;
    }

    public void addY(double y) {
        y = y;
    }

    public double distanceReturn() {
        return Math.sqrt(x * x + y * y);
    }
}
