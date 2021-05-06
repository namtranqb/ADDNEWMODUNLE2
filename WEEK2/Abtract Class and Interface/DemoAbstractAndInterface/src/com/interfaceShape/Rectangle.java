package com.interfaceShape;

public class Rectangle implements Shape,Resizeable{
    private double width;
    private  double length;

    public Rectangle(){}
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea(){
        return this.width * this.length;
    }

    @Override
    public double getPerimeter(){
        return (this.length + this.width)* 2;
    }

    @Override
    public void display(){
        System.out.println("Rectangle "
                +"\nWidth: "+this.width
                +"\nLength: "+this.length
                +"\nArea: "+this.getArea()
                +"\nPerimeter: "+this.getPerimeter());

    }

    @Override
    public void resize(double percent) {
        this.width = this.getWidth() * (percent/100);
        this.length = this.getLength() * (percent/100);
    }
}
