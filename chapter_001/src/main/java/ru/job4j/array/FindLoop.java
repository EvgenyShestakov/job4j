package ru.job4j.array;
/**Square
 * @author Evgeny Shestakov (lester_g@inbox.ru)
 * @version 1.0
 * @since 29.06.2019
 */
public class FindLoop {
    /**Поиск перебором
     * @return rst
     */
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}
