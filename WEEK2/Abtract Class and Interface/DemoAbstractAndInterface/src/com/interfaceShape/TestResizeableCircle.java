package com.interfaceShape;

import java.util.Arrays;

public class TestResizeableCircle {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(1.0);
        circles[1] = new Circle(2.0);
        circles[2] = new Circle(3.0);

        for(Circle i:circles){
            System.out.println("************");
            i.display();
        }

        circles[1].resize(150);
        circles[2].resize(3);
        for(Circle i:circles){
            System.out.println("************");
            i.display();
        }
    }
}
