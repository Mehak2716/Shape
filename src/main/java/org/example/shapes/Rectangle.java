package org.example.shapes;
import org.example.interfaces.Shape;

import java.lang.*;
public class Rectangle implements Shape {

    private double length;
    private double breadth;

    public Rectangle(double length, double breadth)
    {
        if(length<=0 || breadth<=0)
            throw new IllegalArgumentException("Passed negative length or breadth");

        this.length=length;
        this.breadth=breadth;
    }

    public double area()
    {
        return length*breadth;
    }

    public double circumference()
    {
        return 2*(length+breadth);
    }
}
