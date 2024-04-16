package com.shapes;

public class Rectangle implements Polygon{

    private double width, height;

    public Rectangle(double width, double height){

        this.width = width;
        this.height = height;

    }




    @Override
    public double getArea() {

        // Calculate the area of the rectangle

        return width * height;
    }

    @Override
    public double addBorder() {
        return 0;
    }
}