package org.CodeForPizza.Uppgift2;

public class Circle extends Shape implements CircleInterface{

    double area = 0;

    double radius = 0;

    public Circle(double radius){
        this.radius = radius;

    }
    @Override
    public double calculateArea(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }
        return Math.PI * radius * radius;
    }
}
