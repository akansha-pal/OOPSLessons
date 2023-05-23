package com.sparta.ap.safaripark.safaripark.shapes;

import java.util.ArrayList;
import java.util.Collections;

public class ShapeApp {
    public static void main(String[] args) {
        var circle = new Circle(15);
        var circle2 = new Circle(10);
        var circle3 = new Circle(12);
        var rectangle = new Rectangle(4, 9);
        var rectangle2 = new Rectangle(1, 2);
        var rectangle3 = new Rectangle(90, 5);
        var cArea = circle.calculateArea();
        var rArea = rectangle.calculateArea();
        /*System.out.println(cArea);
        System.out.println(rArea);
        System.out.println(circle.hashCode());
        System.out.println(circle.equals(circle));
        System.out.println(rectangle.hashCode());
        System.out.println(rectangle.equals(circle));*/
        ArrayList<Circle> arrayListC = new ArrayList<>();
        ArrayList<Rectangle> arrayListR = new ArrayList<>();
        arrayListC.add(circle);
        arrayListC.add(circle2);
        arrayListC.add(circle3);
        arrayListR.add(rectangle);
        arrayListR.add(rectangle2);
        arrayListR.add(rectangle3);
        for (var obj : arrayListC) {
            System.out.println(obj);
        }
        for (var obj : arrayListR) {
            System.out.println(obj);
        }
        Collections.sort(arrayListC);
        Collections.sort(arrayListR);
        for (var obj : arrayListC) {
            System.out.println(obj);
        }
        for (var obj : arrayListR) {
            System.out.println(obj);
        }
        var result = Collections.binarySearch(arrayListC, circle);
        System.out.println(result);
    }
}
