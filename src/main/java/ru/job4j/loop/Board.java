package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        int count = 0;
        for (int w = 1; w <= width; w++) {
            for (int h = 1; h <= height; h++) {
                boolean checkX = (w + h) % 2 == 0;
                if (checkX) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}