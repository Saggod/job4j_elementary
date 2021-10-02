package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rs1 = 0;
        int changeX = Math.abs(x2 - x1);
        int changeY = Math.abs(y2 - y1);
        if (x1 >= 0 && x1 <= 7 && x2 >= 0 && x2 <= 7 && y1 >= 0 && y1 <= 7 && y2 >= 0 && y2 <= 7 && changeX == changeY) {
            rs1 = Math.abs(x2 - x1);
        }
        return rs1;
    }
}