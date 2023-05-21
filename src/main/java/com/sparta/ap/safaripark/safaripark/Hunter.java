package com.sparta.ap.safaripark.safaripark;

import com.sparta.ap.safaripark.Person;

public class Hunter extends Person{
    @Override
    public String toString() {
        return "Hunter{" +
                "camera='" + camera + '\'' +
                '}';
    }

    private String camera = "";
    public Hunter(String firstname, String lastName, int age, String camera){
        super(firstname,lastName,age);
        this.camera = camera;
    }
    public Hunter(){

    }
    public String shoot(){
        return super.toString() + "Hunter shoots a " + camera + " camera";
    }
}
