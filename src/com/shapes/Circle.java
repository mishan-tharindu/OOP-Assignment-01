package com.shapes;

public class Circle extends Polygon {

    public double radius;

    private double area;
    private double areaWithBoder;




    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(double radius, double borderWidth){

        super(borderWidth);
        this.radius = radius;
    }

    @Override
    public double getArea() {

        area = Math.PI * radius * radius;

        return  area;
    }

    @Override
    public double getAreaWithBorder() {

       double totalRadius = radius + getBorderWidth();

        areaWithBoder = Math.PI * Math.pow(totalRadius, 2);

        return areaWithBoder;
    }


}