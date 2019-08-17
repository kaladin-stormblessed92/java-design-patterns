package com.design.creational.factory.abstractimpl.creator;

import com.design.creational.factory.product.Shape;

public abstract class AbstractShapeFactory {

    public abstract Shape getShape();

    public Shape getFactory(){
        return getShape();
    }
}
