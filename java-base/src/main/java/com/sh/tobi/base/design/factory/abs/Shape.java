package com.sh.tobi.base.design.factory.abs;

public interface Shape {

    void draw();

    enum Type{
        CIRCLE,RECTANGLE
    }
}
