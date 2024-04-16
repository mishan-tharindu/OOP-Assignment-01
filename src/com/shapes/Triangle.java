package com.shapes;

public class Triangle implements Polygon{

    private double base, height, borderWidth;

    public Triangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }

    Triangle(double base, double height, double borderWidth){
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
    public double addBorder() {

        double newBaseValue = base + 2 * borderWidth;
        double newHeightValue = height + 2 * height;

        double areawithBorder = 0.5 * newBaseValue * newHeightValue;

        return areawithBorder;
    }
}
