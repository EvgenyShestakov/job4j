package ru.job4j.array;

/**
 * Обертка над строкой.
 */
public class ArrayChar {

    /**
     * Проверяет. что слово начинается с префикса.
     *
     * @param prefix префикс.
     * @return если слово начинаеться с префикса
     */
    public boolean startsWith(String word, String prefix) {
        boolean result = true;
        char[] pref = prefix.toCharArray();
        char[] wrd = word.toCharArray();
        int minLength = Math.min(pref.length, wrd.length);
        for (int i = 0; i < minLength; i++)
        {
            if (wrd[i] != pref[i])
            {
                return false;
            }
        }
        return result;
    }

    }
