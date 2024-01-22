package test;

import org.example.shapes.Square;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SqaureTest {

    @Test (expected = IllegalArgumentException.class)
    public void squareOfNegativeSide()
    {
        Square square = new Square(-1);
        square.area();
    }

    @Test
    public void areaSquareOfSideOne()
    {
        Square square = new Square(1);
        double area = square.area();
        assertEquals(1,area,0.0);
    }

    @Test
    public void areaSquareOfAnySide()
    {
        Square square = new Square(2);
        double area = square.area();
        assertEquals(4,area,0.0);
    }

    @Test
    public void circumferenceSquareOfSideOne()
    {
        Square square = new Square(1);
        double circumference = square.circumference();
        assertEquals(4,circumference,0.0);
    }

    @Test
    public void circumferenceSquareOfAnySide()
    {
        Square square = new Square(4);
        double circumference = square.circumference();
        assertEquals(16,circumference,0.0);
    }
}
