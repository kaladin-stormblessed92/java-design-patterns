package com.design.creational.factory.abstractimpl;

import com.design.creational.factory.abstractimpl.creator.RectangleFactory;
import com.design.creational.factory.product.Shape;

public class FactoryClient {


    public static void main(String[] args){
        Shape  shape = new RectangleFactory().getShape();
        shape.draw();
    }
}
