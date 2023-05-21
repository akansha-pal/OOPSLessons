package com.sparta.ap.safaripark.safaripark;

public class VehicleMain {
    public static void main(String[] args) {
        Airplane a = new Airplane(200, 100, "JetsRUs");
        a.setNumPassangers(157);
        a.ascend(500);
        System.out.println(a.move(3));
        System.out.println(a.toString());
        a.descend(200);
        System.out.println(a.move());
        a.move();
        System.out.println(a.toString());
        a.descend(500);
        System.out.println(a.toString());
    }
}
