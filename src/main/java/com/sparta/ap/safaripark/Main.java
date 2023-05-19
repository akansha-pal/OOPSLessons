package com.sparta.ap.safaripark;

public class Main {
    public static void main(String[] args) {
        Person akansha = new Person("Akansha", "Pal", 30);
        var akanshaName = akansha.getFullName();
        System.out.println(akanshaName);

        akansha.setAge(32);

        var cathy = new Person("Cathy", "French", 56);
        System.out.println(cathy.getFullName());

        var laura = new Person("Laura");
        System.out.println(laura.getFullName());

        var david = new Person();
        System.out.println(david.getFullName());
    }
}