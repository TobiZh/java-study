package com.sh.tobi.base.design.factory.simple;

public class ShapeFactory {

    public Shape getShape(Shape.Type shapeType){
        if (Shape.Type.CIRCLE.equals(shapeType)){
            return new Circle();
        }else if (Shape.Type.RECTANGLE.equals(shapeType)){
            return new Rectangle();
        }else{
            return null;
        }
    }
}
