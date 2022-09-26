package com.sh.tobi.base.design.builder;

public class Director {

    private BikeBuilder builder;

    public Director(BikeBuilder builder){
        this.builder=builder;
    }

    public Bike construct(){
        builder.buildFrame();
        builder.buildSeat();;

        return builder.build();
    }
}
