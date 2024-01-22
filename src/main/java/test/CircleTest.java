package test;

import org.example.shapes.Circle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {

    @Test(expected = IllegalArgumentException.class)
    public void circleOfNegativeRadius() {
        Circle circle = new Circle(-1);
        circle.area();
    }

    @Test
    public void areaCircleOfRadiusOne()
    {
        Circle circle = new Circle(1);
        double area = circle.area();
        assertEquals(3.14,area,0.00);
    }

    @Test
    public void areaCircleofAnyRadius()
    {
        Circle circle = new Circle(2);
        double area = circle.area();
        assertEquals(12.56,area,0.00);
    }

    @Test
    public void circumferenceOfCircleOfRadiusOne()
    {
        Circle circle = new Circle(1);
        double circumference = circle.circumference();
        assertEquals(6.28,circumference,0.00);
    }

    @Test
    public void circumferenceOfCircleOfAnyRadius()
    {
        Circle circle = new Circle(2);
        double cirrcumference = circle.circumference();
        assertEquals(12.56,cirrcumference,0.00);
    }
}
