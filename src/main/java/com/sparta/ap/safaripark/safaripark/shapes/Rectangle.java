package com.sparta.ap.safaripark.safaripark.shapes;

public class Rectangle extends Shape{
    int length;
    int width;
    public Rectangle(int length, int width){
        this.length = length;
        this.width=width;
    }

    @Override
    double calculateArea() {
        return length*width;
    }
}
