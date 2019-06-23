package ru.job4j.loop;
/**
 *Шахматная доска
 * @author Evgeny Shestakov (lester_g@inbox.ru)
 * @version $Id$
 * @since 0.1
 */
public class Board {
    /**
     *Рисует шахматную доску
     * @param width ширина доски
     * @param height высота доски
     *
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // условие проверки, что писать пробел или X
                // Выше в задании мы определили закономерность, когда нужно проставлять X
                if ((i + j) % 2 == 0) {
                    screen.append("x");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод на новую строку.
            screen.append(ln);
        }
        return screen.toString();
    }
}