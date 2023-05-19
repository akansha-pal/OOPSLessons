package com.sparta.ap.safaripark;

public class Person {
    private  String firstName = "";
    private  String  lastName = "";
    private  int age = 35;

    public Person(){

    }

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(String firstName){
        this.firstName = firstName;
    }
    public String getFullName(){
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
