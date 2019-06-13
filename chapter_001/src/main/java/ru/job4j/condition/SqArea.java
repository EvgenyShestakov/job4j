package ru.job4j.condition;

public class SqArea {
    public int square(int p, int k) {
        int h = (p / 2) / (1 + k);
        int w = h * k;
        return h * w;

    }
}