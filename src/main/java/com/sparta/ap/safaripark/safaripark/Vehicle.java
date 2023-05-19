package com.sparta.ap.safaripark.safaripark;

public class Vehicle {
    private int speed = 10;
    private int capacity = 4;
    private int position;
    private int numPassangers;

    public Vehicle(){

    }

    public Vehicle(int capacity, int speed){
        //move();
    }
    public Vehicle(int capacity, int numPassangers, int position, int speed){
        this.position=position;
        this.numPassangers = numPassangers;
    }

    public int getSpeed() {
        return speed;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPosition() {
        return position;
    }

    public int getNumPassangers() {
        return numPassangers;
    }

    public void setNumPassangers(int numPassangers) {
        if(numPassangers <= capacity && numPassangers > 0){
            this.numPassangers = numPassangers;
        }
    }

    public String move(int times){
        this.position = speed * times;
        return "Moving along " + times + " times";
    }
    public String move(){
        this.position = position + speed;
        return "Moving along";
    }

}
