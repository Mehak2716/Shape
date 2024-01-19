package test;

import org.example.shapes.Traingle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TraingleTest {

    @Test
    public void areaTraingleofSideOne()
    {
        Traingle triangle = new Traingle(1,1,1);
        double area = triangle.area();
        assertEquals(0.43,area,0.01);
    }

    @Test
    public void areaTraingleOfAnySide()
    {
        Traingle triangle = new Traingle(1,2,3);
        double area = triangle.area();
        assertEquals(0,area,0.0);
    }

    @Test
    public void circumferenceTriangleOfSideOne()
    {
        Traingle triangle = new Traingle(1,1,1);
        double circumference = triangle.circumference();
        assertEquals(3,circumference,0.0);
    }

    @Test
    public void circumferenceTriangleOfAnySide()
    {
        Traingle triangle = new Traingle(3,4,5);
        double circumference = triangle.circumference();
        assertEquals(12,circumference,0.0);
    }
}
