package com.shapes;

public class Circle implements Polygon{

    private double radius, borderWidth;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    Circle(double radius, double borderWidth){
        this.radius = radius;
        this.borderWidth = borderWidth;
    }

    @Override
    public double getArea() {

        double circleArea = Math.PI * radius * radius;

        return  circleArea;
    }

    @Override
    public double addBorder() {

        double areaWithBorder = Math.PI * Math.pow(radius + borderWidth, 2);

        return 0;
    }
}