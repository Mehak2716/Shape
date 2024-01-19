package org.example.shapes;
import org.example.interfaces.Shape;

import java.lang.*;
public class Circle implements Shape {

    private double radius;

    private final double PI=3.14;

    public Circle(double radius)
    {
        if(radius<=0)
            throw new IllegalArgumentException("Passed negative radius");

        this.radius=radius;
    }

    public double area()
    {
        return PI*radius*radius;
    }

    public double circumference()
    {
        return 2*PI*radius;
    }
}
