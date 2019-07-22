package ru.job4j.exambs;

public class Merge {
    public static int[] combine(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, q = 0;
        while (i < a.length && j < b.length)
            c[q++] = a[i] < b[j] ? a[i++] :  b[j++];
        while (i < a.length)
            c[q++] = a[i++];
        while (j < b.length)
            c[q++] = b[j++];
        return c;
    }
}
