package com.interfaceShape;

public class Cylinder extends Circle implements VolumeShape{
    private double height;

    public Cylinder() {
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getVolume(){
        return this.getArea() * this.getHeight();
    }

    @Override
    public void display(){
        System.out.println("Cylinder "
                +"\nRadius: "+this.getRadius()
                +"\nHeight: "+this.height
                +"\nArea: "+this.getArea()
                +"\nPerimeter: "+this.getPerimeter()
                +"\nVolume: "+this.getVolume());

    }
}
