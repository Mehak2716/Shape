package org.example.shapes;

public class Traingle {

    private double side1;
    private double side2;

    private double side3;

    public Traingle(double side1,double side2,double side3) {

        if(side1<=0 || side2<=0 || side3<=0)
            throw new IllegalArgumentException("Negative Side Passed");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double area()
    {
       double s = (side1+side2+side3)/2;

       return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

    public double circumference()
    {
        return side1+side2+side3;
    }
}
