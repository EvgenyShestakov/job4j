package ru.job4j.array;

import java.util.Arrays;
/**ArrayDuplicate
 * @author Evgeny Shestakov (lester_g@inbox.ru)
 * @version 1.0
 * @since 06.07.2019
 */
public class ArrayDuplicate {
    /**Убирает дубликаты строк из массива
     * @param array
     * return unique
     */
    public String[] remove(String[] array) {
        int unique = array.length;
        for (int out = 0; out < unique; out++) {
            for (int in = out + 1; in < unique; in++) {
                if (array[out].equals(array[in])) {
                    array[in] = array[unique - 1];
                    unique--;
                    in--;
                }
            }
        } return Arrays.copyOf(array, unique);
    }
}


