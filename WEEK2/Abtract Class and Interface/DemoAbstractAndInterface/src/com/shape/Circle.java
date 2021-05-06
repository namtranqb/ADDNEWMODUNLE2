package com.shape;

public class Circle extends Shape{
    protected double radius = 1.0D;

    public Circle(){}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.pow(this.radius,2)*Math.PI;
    }
    @Override
    public double getPerimeter(){
        return this.radius * 2 * Math.PI;
    }
    @Override
    public String toString(){
        return "Circle [ "+super.toString();
    }

}
