package com.sh.tobi.base.design.builder;

public class MobileBike extends BikeBuilder{
    @Override
    public void buildFrame() {
        bike.setFrame("车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("车座");
    }

    @Override
    public Bike build() {
        return bike;
    }
}
