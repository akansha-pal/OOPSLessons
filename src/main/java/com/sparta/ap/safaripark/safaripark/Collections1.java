package com.sparta.ap.safaripark.safaripark;

import java.util.ArrayList;
import java.util.Collections;

public class Collections1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        numbers2.add(45);
        numbers2.add(55);
        numbers2.add(35);
        numbers2.add(25);
        numbers2.add(15);
        numbers.add(2, 7);
        System.out.println(numbers);
//    System.out.println(numbers2);
//    numbers.remove(1);
//    System.out.println(numbers);
//    System.out.println(numbers.contains(3));
//    numbers.addAll(numbers2);
//    System.out.println(numbers);
//    numbers.addAll(0,numbers2);
//    System.out.println(numbers);
        System.out.println(numbers2);
        Collections.reverse(numbers2);
        System.out.println(numbers2);
        String str = "Pawan";
        String str1 = "Pawan1";
        System.out.println(str.hashCode());
        System.out.println(numbers2.hashCode());
    }
}