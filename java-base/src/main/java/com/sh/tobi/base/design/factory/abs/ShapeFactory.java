package com.sh.tobi.base.design.factory.abs;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(Color.Type colorType) {
        return null;
    }

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
