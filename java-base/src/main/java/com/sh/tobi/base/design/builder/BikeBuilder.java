package com.sh.tobi.base.design.builder;

public abstract class BikeBuilder {

    protected Bike bike=new Bike();

    public abstract void buildFrame();
    public abstract void buildSeat();
    public abstract Bike build();


}
