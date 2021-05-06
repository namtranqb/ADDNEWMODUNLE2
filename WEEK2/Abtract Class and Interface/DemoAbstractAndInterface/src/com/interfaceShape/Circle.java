package com.interfaceShape;

public class Circle implements Shape,Resizeable {
    private  double radius;

    public Circle(){}
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(this.radius,2) * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return this.radius * 2 * Math.PI;
    }

    @Override
    public void display() {
        System.out.println("Circle "
                            +"\nRadius: "+this.radius
                            +"\nArea: "+this.getArea()
                            +"\nPerimeter: "+this.getPerimeter());

    }

    @Override
    public void resize(double percent) {
        this.radius= this.getRadius() * (percent/100);
    }
}
