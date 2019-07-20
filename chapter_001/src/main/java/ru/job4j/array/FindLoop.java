package ru.job4j.array;

/**Square
 * @author Evgeny Shestakov (lester_g@inbox.ru)
 * @version 1.0
 * @since 29.06.2019
 */
public class FindLoop {
    /**Поиск перебором
     * если элемента нет в массиве, то возвращаем -1.
     * @return rst
     */
    public int indexOf(int[] data, int el) {
        int result = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                result = i;
                break;
            }
        }
        return result;
    }
}
