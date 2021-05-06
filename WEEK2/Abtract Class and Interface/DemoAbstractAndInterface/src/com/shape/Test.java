package com.shape;

public class Test {
    public static void main(String[] args) {
        Circle c = new Circle(6.0D);
        Rectangle r = new Rectangle(3.2,3.5);
        Rectangle s = new Square(5.0);
        Square s1 = new Square("blue",false,3.0);
        Shape s2 = new Square(4.0);

        System.out.println(c.toString());
        System.out.println("Area: "+c.getArea());
        System.out.println("Perimeter: "+c.getPerimeter());
        System.out.println("\n");


        System.out.println(r.toString());
        System.out.println("Area: "+r.getArea());
        System.out.println("Perimeter: "+r.getPerimeter());
        System.out.println("\n");

        System.out.println(s.toString());
        System.out.println("Area: "+s.getArea());
        System.out.println("Perimeter: "+s.getPerimeter());
        System.out.println("\n");

        System.out.println(s1.toString());
        System.out.println("Area: "+s1.getArea());
        System.out.println("Perimeter: "+s1.getPerimeter());



    }
}
