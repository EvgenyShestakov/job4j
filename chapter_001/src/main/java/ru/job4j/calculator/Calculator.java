package ru.job4j.calculator;

/**
 * Class Класс для вычисления арифметических операций + - * /.
 * @author Evgeny Shestakov
 * @since 11.06.2019
 * @version 1.0
 */
public class Calculator {
    /**
     * Сложение.
      * @param first первый аргумент.
     * @param second второй аргумент.
     * @return результат.
     */

 public double add(double first, double second) {
 return first + second;
 }
    /**
     * Вычитание.
     * @param first первый аргумент.
     * @param second второй аргумент.
     * @return результат.
     */
    public double subtract(double first, double second) {
 return first - second;
 }
    /**
     * Деление.
     * @param first первый аргумент.
     * @param second второй аргумент.
     * @return результат.
     */
    public double div(double first, double second) {
 return first / second;
 }
    /**
     * Умножение.
     * @param first первый аргумент.
     * @param second второй аргумент.
     * @return результат.
     */
    public double multiple(double first, double second) {
 return first * second;
 }

 }
