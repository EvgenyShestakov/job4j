package ru.job4j.array;

/**BubbleSort
 * @author Evgeny Shestakov (lester_g@inbox.ru)
 * @version 1.0
 * @since 01.07.2019
 */
public class BubbleSort {
    /**Bubble sorting
     * @param  mas
     * @return mas
     */
    public int[] bubbleDouble(int[] mas) {
        for (int i = 0; i < mas.length - 1; i++) {
            for (int j = 0; j < mas.length - i - 1; j++) {
                if (mas[j] > mas[j + 1]) {
                    int tmp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = tmp;
                }
            }
        } return mas;
    }
}
