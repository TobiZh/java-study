package com.sh.tobi.base.design.factory.abs;

public class FactoryProducer {

    public AbstractFactory getFactory(AbstractFactory.Type type){
        if (AbstractFactory.Type.COLOR.equals(type)){
            return new ColorFactory();
        }else if (AbstractFactory.Type.SHAPE.equals(type)){
            return new ShapeFactory();
        }
        return null;
    }
}
