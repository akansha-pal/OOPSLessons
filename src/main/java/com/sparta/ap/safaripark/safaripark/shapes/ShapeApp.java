package com.sparta.ap.safaripark.safaripark.shapes;

public class ShapeApp {
    public static void main(String[] args) {
        var circle = new Circle(5);
        var rectangle = new Rectangle(4,9);
        var cArea = circle.calculateArea();
        var rArea = rectangle.calculateArea();
        System.out.println(cArea);
        System.out.println(rArea);
        System.out.println(circle.hashCode());
        System.out.println(circle.equals(circle));
        System.out.println(rectangle.hashCode());
        System.out.println(rectangle.equals(circle));
    }
}
