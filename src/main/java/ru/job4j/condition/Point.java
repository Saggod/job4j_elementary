package ru.job4j.condition;

import ru.job4j.calculator.MathFunc;

public class Point {

    private static double distance(int x1, int y1, int x2, int y2) {
        double x = x2 - x1;
        double y = y2 - y1;
        x = Math.pow(x, 2); //возведение в квадрат
        y = Math.pow(y, 2);
        double summXY = x + y;
        double result = Math.sqrt(summXY); //извлечение корня
        return result;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
