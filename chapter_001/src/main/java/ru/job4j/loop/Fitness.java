package ru.job4j.loop;

public class Fitness {
    public int calc(int ivan, int nik) {
        int month = 0;
        int a = ivan;
        int b = nik;
        while (a < b) {
            month++;
            a = a * 3;
            b = b * 2;

        }
        return month;
    }
}