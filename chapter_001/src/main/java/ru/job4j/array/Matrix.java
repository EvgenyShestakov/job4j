package ru.job4j.array;

/**Matrix
 * @author Evgeny Shestakov (lester_g@inbox.ru)
 * @version 1.0
 * @since 02.07.2019
 */
public class Matrix {
    /**Таблица умножения
     * @param size
     * return table
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table [i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
