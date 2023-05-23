package com.sparta.ap.safaripark.safaripark.shapes;

public class Circle extends Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return 3.14 * radius * radius;
    }
    @Override
    public String toString(){
     return "Circle : 3.14 " + "radius" + radius +"radius" + radius;
    }
}
