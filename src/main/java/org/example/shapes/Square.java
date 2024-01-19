package org.example.shapes;

import org.example.interfaces.Shape;

public class Square implements Shape {

    private int side;

    public Square(int side)
    {
        if(side<=0)
            throw new IllegalArgumentException("Negative Side Passed");

        this.side=side;
    }

    public double area()
    {
        return side*side;
    }

    public double circumference()
    {
        return 4*side;
    }
}

//public class Square extends Rectangle{
//
//    private int side;
//    public Square(int side)
//    {
//        if(side<=0)
//            throw new IllegalArgumentException("Passed negative Side");
//        super(side,side);
//        this.side=side;
//
//
//    }
//
//}