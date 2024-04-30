package com.shapes;

import com.shapes.Polygon;

public class Pantagon extends Polygon {

    private double sideLegnth;

    Pantagon(double sideLegnth, double borderWidth){
        super(borderWidth);
        this.sideLegnth = sideLegnth;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getAreaWithBorder() {
        return 0;
    }
}
