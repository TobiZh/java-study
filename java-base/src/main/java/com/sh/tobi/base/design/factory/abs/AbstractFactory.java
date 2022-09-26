package com.sh.tobi.base.design.factory.abs;

public abstract class AbstractFactory {

    public abstract Color getColor(Color.Type colorType);
    public abstract Shape getShape(Shape.Type shapeType);

    enum Type{
        COLOR,SHAPE
    }
}
