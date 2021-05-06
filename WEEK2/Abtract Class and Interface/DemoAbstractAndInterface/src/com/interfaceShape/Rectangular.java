package com.interfaceShape;

public class Rectangular extends Rectangle implements VolumeShape, Colorable{
    private double height;
//**********//
    public Rectangular() {
    }
    public Rectangular(double width, double length, double height) {
        super(width, length);
        this.height = height;
    }

    //**********//
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //**********//
    @Override
    public double getVolume(){
        return this.getArea() * this.getHeight();
    }
    @Override
    public void display(){
        System.out.println("Rectangular "
                +"\nWidth: "+this.getWidth()
                +"\nLength: "+this.getLength()
                +"\nHeight: "+this.height
                +"\nArea: "+this.getArea()
                +"\nPerimeter: "+this.getPerimeter()
                +"\nVolume: "+this.getVolume());
    }


    @Override
    public void howtoColor() {
        System.out.println(" Color : yellow");
    }
}
