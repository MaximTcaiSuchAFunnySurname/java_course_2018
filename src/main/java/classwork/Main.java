package com.company;

public class Main {

    public static void main(String[] args) {
        Point point2 = new Point(0,0);
Point point = new Point(2,2);
point.addX(2);
point.coordinatesReturn();
        System.out.println(point.distanceReturn());
    Segment segment = new Segment(point, point2);
    segment.coordinatesReturn();
    Point test = new Point(3,3);
        System.out.println(segment.ifPointLiesOnLine(test));
        System.out.println(segment.segmentLength());
        System.out.println(segment.angleReturn());
    }
}
