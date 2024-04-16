package com.shapes;

public class Square implements Polygon {
    private double length;

    private double borderWidth;


    public Square(double length)
    {
        this.length = length;
    }

    public Square(double length, double borderWidth){

        this.length = length;
        this.borderWidth = borderWidth;

    }

    @Override
    public double getArea() {

        // Calculate the area of the Square
        return length * length;
    }

    @Override
    public double addBorder() {

        double areawithBorder = Math.pow(length + 2 * borderWidth, 2);

        return areawithBorder;
    }
}