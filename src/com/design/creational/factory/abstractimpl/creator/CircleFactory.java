package com.design.creational.factory.abstractimpl.creator;

import com.design.creational.factory.product.Circle;
import com.design.creational.factory.product.Shape;

public class CircleFactory extends AbstractShapeFactory {
    @Override
    public Shape getShape() {
        return new Circle();
    }
}
