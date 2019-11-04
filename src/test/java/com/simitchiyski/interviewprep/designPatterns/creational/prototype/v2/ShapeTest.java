package com.simitchiyski.interviewprep.designPatterns.creational.prototype.v2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class ShapeTest {

    private static void cloneAndCompare(List<Shape> shapes) {
        List<Shape> shapesCopy = new ArrayList<>();

        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            assertNotSame(shapes.get(i), shapesCopy.get(i));
            assertEquals(shapes.get(i), shapesCopy.get(i));
        }
    }

    @Test
    public void testClone() {
        List<Shape> shapes = new ArrayList<>();

        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(20);
        circle.setRadius(15);
        circle.setColor("red");
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(10);
        rectangle.setWidth(20);
        rectangle.setColor("blue");
        shapes.add(rectangle);

        cloneAndCompare(shapes);
    }
}