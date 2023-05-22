package com.sparta.ap.safaripark.safaripark.polymorphism;

import com.sparta.ap.safaripark.Person;

public class Hunter extends Person implements IShootable{
    @Override
    public String toString() {
        return "Hunter{" +
                "camera='" + '\'' +
                '}';
    }

    public IShootable shootable;
    public Hunter(String firstname, String lastName, int age, IShootable shootable){
        //super(firstname,lastName,age);
        this.firstName = firstname;
        this.lastName = lastName;
        this.shootable = shootable;
    }
    public Hunter(){

    }
    public String shoot(){
        return getFirstName() + " " + getLastName() + " is " + shootable.shoot();
    }

    public void setShootable(LaserGun gun) {
        this.shootable=gun;
    }
    public void setShootable(WaterPistol pistol) {
        this.shootable=pistol;
    }

    public void setShootable(Weapon anotherPistol) {
        this.shootable=anotherPistol;
    }
}
