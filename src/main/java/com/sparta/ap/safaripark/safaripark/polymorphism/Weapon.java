package com.sparta.ap.safaripark.safaripark.polymorphism;

abstract class Weapon implements IShootable {

    public enum Brand {
        ACME, SUPERSOAKER, NIAGRA, MINOLTA;
    }
    Brand b;
    public Weapon(String str) {
        switch (str) {
            case "Acme" -> {
                this.b = Brand.ACME;
            }
            case "Supersoaker" -> {
                this.b = Brand.SUPERSOAKER;
            }
            case "Niagara" -> {
                this.b = Brand.NIAGRA;
            }
            case "Minolta" -> {
                this.b = Brand.MINOLTA;
            }
        }
    }

    @Override
    public String toString() {
        return "";
    }


}

class LaserGun extends Weapon {

    public LaserGun(String str) {
        super(str);
    }

    @Override
    public String shoot() {
        return "Zing!! Shooting a LaserGun - " + b;
    }
}

class WaterPistol extends Weapon {

    public WaterPistol(String str) {
        super(str);
    }

    @Override
    public String shoot() {
        return "Splash!! Shooting a WaterPistol - " + b;
    }
}


