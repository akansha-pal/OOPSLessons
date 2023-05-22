package com.sparta.ap.safaripark.safaripark;

public class StaticAndFinal {
    int id=4000;
    public static void main(String[] args){
        //System.out.println(id);
        StaticAndFinal saf = new StaticAndFinal();
        System.out.println(saf.id);
        final int age = 43;
        //age=45;
        System.out.println( );
    }
    {
        //System.out.println(id);
    }
    static {
        var value1=56;
        System.out.println(value1+" ");
    }
    static {
        var value1=26;
        System.out.println(value1);
    }
    static {
        var id=100;
        System.out.println(id + " ");
    }
}
