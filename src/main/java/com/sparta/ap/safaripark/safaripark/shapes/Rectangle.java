package com.sparta.ap.safaripark.safaripark.shapes;

public class Rectangle extends Shape {
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle : length" + length + " width" + width;
    }

    @Override
    public int hashCode() {
        return 10;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
