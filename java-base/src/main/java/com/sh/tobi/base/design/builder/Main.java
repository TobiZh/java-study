package com.sh.tobi.base.design.builder;

public class Main {

    public static void main(String[] args) {
        Director director=new Director(new MobileBike());
        Bike bike=director.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());

    }
}
