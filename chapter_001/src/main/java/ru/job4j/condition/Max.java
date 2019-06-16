package ru.job4j.condition;
/**Max
 * @author Evgeny Shestakov (lester_g@inbox.ru)
 * @version 1.0
 * @since 16.06.2019
 */
public class Max {
    /**
     * Метод max возвращает максимальное из двух чисел.
     *@return result
     */

    public int max(int left, int right) {
        return (left >= right) ? left : right;

    }
}
