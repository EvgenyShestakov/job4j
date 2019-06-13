package ru.job4j.condition;

/**
 * SqArea
 * @author Evgeny Shestakov
 *  * @since 14.06.2019
 *  * @version 1.0
 */

public class SqArea {
    /**
     * Method square.
     * @param p периметр
     * @param k коэффициент
     * @return площадь
     */
    public int square(int p, int k) {
        int h = (p / 2) / (1 + k);
        int w = h * k;
        return h * w;

    }
}