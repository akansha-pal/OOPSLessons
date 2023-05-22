package com.sparta.ap.safaripark.safaripark.polymorphism;

abstract class Weapon implements IShootable{
     String brand;
    public Weapon(String str){
        this.brand=str;
    }
    @Override
    public String toString(){
        return "";
    }
}

class LaserGun extends Weapon{

    public LaserGun(String str) {
        super(str);
    }

    @Override
    public String shoot() {
        return "Zing!! Shooting a LaserGun - " + brand;
    }
}

class WaterPistol extends Weapon{

    public WaterPistol(String str) {
        super(str);
    }

    @Override
    public String shoot() {
        return "Splash!! Shooting a WaterPistol - " + brand;
    }
}


