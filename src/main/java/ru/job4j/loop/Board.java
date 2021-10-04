package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        int count = 0;
        for (int row = 0; row < width; row++) {
            for (int cell = 0; cell < height; cell++) {
                boolean checkX = (row + cell) % 2 == 0;
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
