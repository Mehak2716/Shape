package test;

import org.example.shapes.Rectangle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RectangleTest {

    @Test
    public void rectangleOfNegativeSide()
    {
        Rectangle rectangle = new Rectangle(-1,2);
        rectangle.area();

    }

    @Test
    public void RrectangleofSideOne()
    {
        Rectangle rectangle = new Rectangle(1,1);
        double result = rectangle.area();
        assertEquals(result,1,0.0);

        double circumferenceResult = rectangle.circumference();
        assertEquals(circumferenceResult,4,0.0);
    }

    @Test
    public void RectangleofDiffSides()
    {
        Rectangle rectangle = new Rectangle(2,3);
        double areaResult = rectangle.area();
        assertEquals(areaResult,6,0.0);

        double circumferenceResult = rectangle.circumference();
        assertEquals(circumferenceResult,10,0.0);
    }


}
