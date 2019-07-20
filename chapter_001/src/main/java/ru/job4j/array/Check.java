package ru.job4j.array;

/**Check
 * @author Evgeny Shestakov (lester_g@inbox.ru)
 * @version 1.0
 * @since 30.06.2019
 */
public class Check {
    /**Массив заполнен true или false
     * @return result
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != result) {
                return  false;
            }
        }
            return result;
    }
    }

