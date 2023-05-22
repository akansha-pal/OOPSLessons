package com.sparta.ap.safaripark.safaripark.polymorphism;

public class Camera implements IShootable{
    private String brand;
    public Camera(String str){
        this.brand = str;
    }

    @Override
    public String shoot() {
        return " shooting a Camera - " + brand;
    }
    public String toString(){
        return null;
    }

}
