package com.shapes;

public abstract class Polygon {

    private double borderWidth;

    public Polygon()
    {

    }

    public Polygon(double borderWidth){
        this.borderWidth = borderWidth;
    }

    public double getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(double borderWidth) {
        this.borderWidth = borderWidth;
    }


    /*
    *
    * Me widiyta kalama apita variables use krna one, eathkota eka wa hoda anith option 02 eka
    *
    * */

//    public double getAreaBorder(double areawithBoder, double area) {
//
//        double boderarea = areawithBoder - area;
//
//        return boderarea;
//    }


    /*
    *
    * Option 02
    *
    * */

    public double getAreaBorder() {

        double boderarea = getAreaWithBorder() - getArea();

        return boderarea;
    }

    public abstract double getArea();

    public abstract double getAreaWithBorder();

//    public abstract double getAreaBorder();


}
