package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
     int resultFs   = first > second ? first : second;
     return third > resultFs ? third : resultFs;

    }
}