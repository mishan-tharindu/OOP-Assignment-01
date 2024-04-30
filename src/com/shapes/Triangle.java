package com.shapes;

public class Triangle extends Polygon {

    public double base;
    public double height;
    private double borderWidth;

    public Triangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }

    public Triangle(double base, double height, double borderWidth){
        this.base = base;
        this.height = height;
        this.borderWidth = borderWidth;
    }

    @Override
    public double getArea() {

        // Calculate the area of the triangle
        double areawithBorder = 0.5 * base * height;

        return  areawithBorder;
    }

    @Override
    public double getAreaWithBorder() {
        double newBaseValue = base + 2 * borderWidth;
        double newHeightValue = height + 2 * height;

        double areawithBorder = 0.5 * newBaseValue * newHeightValue;

        return areawithBorder;
    }

}
