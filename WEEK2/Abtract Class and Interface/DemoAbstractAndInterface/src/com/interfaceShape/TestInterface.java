package com.interfaceShape;

public class TestInterface {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(5);
        shapes[3] = new Rectangular(3,3,3);
        shapes[2] = new Rectangle(4,4);
        shapes[1] = new Cylinder(6,5);

        for(Shape i:shapes){
            System.out.println("************");
            i.display();
        }
    }
}
