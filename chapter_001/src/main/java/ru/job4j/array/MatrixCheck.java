package ru.job4j.array;
/**Matrix Check
 * @author Evgeny Shestakov (lester_g@inbox.ru)
 * @version 1.0
 * @since 30.06.2019
 */
public class MatrixCheck {
    /**
     * Метод должен проверить, что все элементы по диагоналям равны true или false.
     *
     * @param data массив
     * @return результат
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        int x = data.length - 1;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i][i] != data[i + 1][i + 1] || (data[i][x - i] != data[i + 1][x - i - 1])) {
                result = false;
                break;


            }
        }
        return result;
    }
}