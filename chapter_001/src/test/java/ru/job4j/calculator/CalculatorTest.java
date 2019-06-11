package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Evgeny Shestakov (lester_g@inbox.ru)
 * @version 1.0
 * @since 11.06.2019
 */

public class CalculatorTest  {
    /**
     * Test add.
     */
    @Test
    public void whenAddThreePlusFiveThenEight()  {
        Calculator calc = new Calculator();
        double result = calc.add(3D, 5D);
        double expected = 8D;
        assertThat(result, is(expected));
    }

    /**
     * Test subtract.
     */
    @Test
    public void whenSubtractTenMinusFiveThenFive()  {
        Calculator calc = new Calculator();
        double result = calc.subtract(10D, 5D);
        double expected = 5D;
        assertThat(result, is(expected));
    }

    /**
     * Test div.
     */
    @Test
    public void whenDivEightDividedByTwoThenFour()  {
        Calculator calc = new Calculator();
        double result = calc.div(8D, 2D);
        double expected = 4D;
        assertThat(result, is(expected));
    }

    /**
     * Test multiple.
     */
    @Test
    public void whenMultipleFiveTimesFiveThenTwentyFive()  {
        Calculator calc = new Calculator();
        double result = calc.multiple(5D, 5D);
        double expected = 25D;
        assertThat(result, is(expected));
    }
}