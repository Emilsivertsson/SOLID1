package org.CodeForPizza.Uppgift2;

public class Rectangle extends Shape implements RectangleInterface{

    double area = 0;

    double side1 = 0;
    double side2 = 0;

    public Rectangle(double side1, double side2){
        this.side1 = side1;
        this.side2 = side2;

    }
    @Override
    public double calculateArea(double side1, double side2) {
        if(side1 < 0 || side2 < 0){
            throw new IllegalArgumentException("x and y must be positive");
        }
        return side1 * side2;
    }
}
