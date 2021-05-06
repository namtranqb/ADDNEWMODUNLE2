package com.interfaceShape;

public class TestResizeableRectangle {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[2];
        rectangles[0] = new Rectangle(2.0,2.0);
        rectangles[1] = new Rectangle(2.0,3.0);

        for(Rectangle rectangle:rectangles){
            System.out.println("*********");
            rectangle.display();
        }

        rectangles[0].resize(50);
        rectangles[1].resize(200);
        for(Rectangle rectangle:rectangles){
            System.out.println("*********");
            rectangle.display();
        }
    }
}
