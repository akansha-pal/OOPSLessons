package com.sparta.ap.safaripark.safaripark;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle newVehicle = new Vehicle(10, 20, 8, 2);
        var numOfPassanger = newVehicle.getNumPassangers();
        System.out.println(numOfPassanger);
    }
}
