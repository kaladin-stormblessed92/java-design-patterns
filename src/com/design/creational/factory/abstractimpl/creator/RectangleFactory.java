package com.design.creational.factory.abstractimpl.creator;

import com.design.creational.factory.product.Rectangle;
import com.design.creational.factory.product.Shape;

public class RectangleFactory extends AbstractShapeFactory {
    @Override
    public Shape getShape() {
        return new Rectangle();
    }
}
