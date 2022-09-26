package com.sh.tobi.base.design.factory.abs;

public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(Color.Type colorType) {
        if (Color.Type.RED.equals(colorType)){
            return new Red();
        }else if (Color.Type.YELLOW.equals(colorType)){
            return new Yellow();
        }else{
            return null;
        }
    }

    public Shape getShape(Shape.Type shapeType){
        return null;
    }
}
