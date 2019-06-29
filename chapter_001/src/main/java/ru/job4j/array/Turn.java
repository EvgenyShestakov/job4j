package ru.job4j.array;
/**Turn
 * @author Evgeny Shestakov (lester_g@inbox.ru)
 * @version 1.0
 * @since 29.06.2019
 */
public class Turn {
    /**Переворачивает массив
     * @return array
     */
    public int[] back(int[] array) {
        int n = array.length;
        int temp;
        for (int i = 0; i < n / 2; i++) {
            temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;

        }
        return array;
    }
}