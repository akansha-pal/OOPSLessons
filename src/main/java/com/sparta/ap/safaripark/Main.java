package com.sparta.ap.safaripark;

import com.sparta.ap.safaripark.safaripark.Hunter;

public class Main {
    public static void main(String[] args) {
//        Person akansha = new Person("Akansha", "Pal", 30);
//        var akanshaName = akansha.getFullName();
//        System.out.println(akanshaName);
//
//        akansha.setAge(32);
//
//        var cathy = new Person("Cathy", "French", 56);
//        System.out.println(cathy.getFullName());
//
//        var laura = new Person("Laura");
//        System.out.println(laura.getFullName());
//
//        var david = new Person();
//        System.out.println(david.getFullName());
//    }

        // Inheritance
        Hunter Diana = new Hunter("Diana", "Artemis", 21, "Leica");
        {
            System.out.println(Diana.getAge());
            System.out.println(Diana.shoot());
            var dianaCanAcccessProtected = Diana.getFirstName();

            Hunter hawkeye = new Hunter("hawkeye", "Marvel", 33, "Canon");
            Hunter hawkeye2 = new Hunter("hawkeye", "Marvel", 33, "Canon");
//            var same = hawkeye.equals(hawkeye2);
//            var h1hashcode = hawkeye.hashCode();
//            var h2hashcode = hawkeye2.hashCode();
//            var type = hawkeye.getClass();
//            var toStringResult = hawkeye.toString();
           // System.out.println(toStringResult);
            System.out.println(hawkeye);

            Person cathy = new Person("Cathy", "french", 31);
            System.out.println(cathy);
        }

    }
}