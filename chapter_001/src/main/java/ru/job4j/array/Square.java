package ru.job4j.array;
/**Square
 * @author Evgeny Shestakov (lester_g@inbox.ru)
 * @version 1.0
 * @since 16.06.2019
 */
public class Square {
    /**Заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
     * @param bound
     * @return rst
     *
     */
    public int[] calculate(int bound) {
        int[] result = new int[bound];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) Math.pow(1 + i, 2);
        }
        return result;
    }
}