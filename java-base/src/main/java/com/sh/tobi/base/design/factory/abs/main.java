package com.sh.tobi.base.design.factory.abs;

public class main {

    public static void main(String[] args) {

        FactoryProducer factoryProducer=new FactoryProducer();

        AbstractFactory colorFactory=factoryProducer.getFactory(AbstractFactory.Type.COLOR);
        Color red=colorFactory.getColor(Color.Type.RED);
        red.fill();
        Color yellow=colorFactory.getColor(Color.Type.YELLOW);
        yellow.fill();

        AbstractFactory shapeFactory=factoryProducer.getFactory(AbstractFactory.Type.SHAPE);
        Shape circle=shapeFactory.getShape(Shape.Type.CIRCLE);
        circle.draw();
        Shape rectangle=shapeFactory.getShape(Shape.Type.RECTANGLE);
        rectangle.draw();
    }
}
