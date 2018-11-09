package com.company;

public class Segment {
    static Point start;
    static Point end;

    public Segment(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public double segmentLength() {
        double res = ((end.x - start.x) * (end.x - start.x)) + ((end.y - start.y) * (end.y - start.y));
        return Math.sqrt(res);
    }
       public double angleReturn(){
        return Math.atan((end.y-start.y)/(end.x-start.x));
       }

    public void coordinatesReturn() {
        System.out.println("1st (x,y) is " + "(" + start.x + "," + start.y + ")");
        System.out.println("2nd (x,y) is " + "(" + end.x + "," + end.y + ")");
    }

    public boolean ifPointLiesOnLine(Point point) {
        if (point.x / point.y == start.x / start.y && point.x / point.y == end.x / end.y && start.x / start.y == end.x / end.y) {
            return true;
        } else return false;
    }


}
