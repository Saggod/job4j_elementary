package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        int count = 0;
        for (int h = 1; h <= 4; h++) {
            for (int w = 0; w <= 4; w++) {
                int sumWH = (w + h) % 2;
                boolean cjeckX = sumWH == 0;
                if (cjeckX) {
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
