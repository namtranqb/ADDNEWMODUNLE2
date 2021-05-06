package com.interfaceShape;
import java.util.Arrays;

public class TestCircleComparator {
    public static void main(String[] args) {
        Circle[] circles = new Circle[2];
        circles[0] = new Circle(3.5);
        circles[1] = new Circle(2.0);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
