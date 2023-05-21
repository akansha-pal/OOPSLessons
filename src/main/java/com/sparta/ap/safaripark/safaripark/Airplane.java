package com.sparta.ap.safaripark.safaripark;

public class Airplane extends Vehicle {
    private final String airline;
    private int altitude;

    public Airplane(int capacity, int speed, String airline) {
        this.airline = airline;
        this.capacity = capacity;
        this.speed = speed;
    }

    public int getAltitude() {
        return altitude;
    }

    public String getAirline() {
        return airline;
    }

    public void ascend(int distance) {
        altitude += distance;
    }

    public void descend(int distance) {
        if (altitude - distance < 0) {
            this.altitude = 0;
        } else {
            this.altitude -= distance;
        }
    }

    @Override
    public String move(int times) {
        return super.move(times) + " at an altitude of " + getAltitude() + " meters";
    }

    @Override
    public String move() {
        return super.move() + " at an altitude of " + getAltitude() + " meters";
    }
    @Override
    public String toString(){
        return super.toString()+" Airplane{airline="+getAirline()+", altitude="+getAltitude()+"}";
    }

}
