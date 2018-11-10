package com.company;

public class Main {
    public static void main(String[] args) {
        Point point2 = new Point(0, 0);
        Point point = new Point(2, 2);
        point.addX(2);
        point.coordinates();
        System.out.println(point.distance());
        Segment segment = new Segment(point, point2);
        segment.coordinates();
        Point test = new Point(3, 3);
        System.out.println(segment.ifPointLiesOnLine(test));
        System.out.println(segment.segmentLength());
    }
}