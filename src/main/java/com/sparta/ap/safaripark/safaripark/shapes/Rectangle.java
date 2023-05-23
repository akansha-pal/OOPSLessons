package com.sparta.ap.safaripark.safaripark.shapes;

public class Rectangle extends Shape implements Comparable<Shape>{
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
        return "Rectangle : length " + length + " width " + width;
    }

    @Override
    public int hashCode() {
        return 10;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
    @Override
    public int compareTo(Shape sh) {
        if (this.length==sh.hashCode()){
            return 0;
        }
        else {
            return 1;
        }
    }
}
