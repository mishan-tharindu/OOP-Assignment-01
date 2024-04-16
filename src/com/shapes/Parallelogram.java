package com.shapes;

public class Parallelogram implements Polygon{

    private double base, height, borderWidth;

    public Parallelogram(double base, double height)
    {
        this.base = base;
        this.height = height;
    }

    Parallelogram(double base, double height, double borderWidth)
    {
        this.base = base;
        this.height = height;
        this.borderWidth = borderWidth;
    }

    @Override
    public double getArea() {

        double area = base * height;

        return area;
    }

    @Override
    public double addBorder() {

        double newBaseValue = base + 2 * borderWidth;
        double newHeightValue = height + 2 * height;

        double areawithBorder = 0.5 * newBaseValue * newHeightValue;

        return areawithBorder;
    }
}