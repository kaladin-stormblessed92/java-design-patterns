package com.design.creational.factory.concreteimpl;

import com.design.creational.factory.product.Shape;

public class FactoryClient {


    public static void main(String[] args){
        Shape  shape = ShapeFactory.getShape(ShapeFactory.SHAPE_RECTANGLE);
        shape.draw();
    }
}
