package com.sh.tobi.base.design.factory.simple;

public class main {

    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape circle=shapeFactory.getShape(Shape.Type.CIRCLE);
        circle.draw();
        Shape rectangle=shapeFactory.getShape(Shape.Type.RECTANGLE);
        rectangle.draw();
    }
}
