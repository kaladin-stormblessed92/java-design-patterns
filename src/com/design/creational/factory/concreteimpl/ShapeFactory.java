package com.design.creational.factory.concreteimpl;

import com.design.creational.factory.product.Circle;
import com.design.creational.factory.product.Rectangle;
import com.design.creational.factory.product.Shape;

public class ShapeFactory {

    public static final String SHAPE_RECTANGLE = "Rectangle";
    public static final String SHAPE_CIRCLE = "Circle";

    public static Shape getShape(String type){
        switch(type){
            case SHAPE_RECTANGLE : return new Rectangle();
            case SHAPE_CIRCLE : return new Circle();
            default: return null;
        }
    }
}
