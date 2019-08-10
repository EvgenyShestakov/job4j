package ru.job4j.condition;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Categories;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;


public class TriangleTest {
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        Point first1 = new Point(0, 0);
        Point second1 = new Point(0, 2);
        Point third1 = new Point(2, 0);
        Triangle triangle = new Triangle(first1, second1, third1);
        double result = triangle.area();
        double expected = 2D;
        assertThat(result, closeTo(expected, 0.1));

    }
}