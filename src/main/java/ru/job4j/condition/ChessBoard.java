package ru.job4j.condition;

public class ChessBoard {
    @SuppressWarnings("checkstyle:NeedBraces")
    public static int way(int x1, int y1, int x2, int y2) {
        int rs1 = 0;
        int changeX = Math.abs(x2 - x1);
        int changeY = Math.abs(y2 - y1);
       if (changeX == changeY && changeX >= 0 && changeY >= 0 && x1 >= 0 && x2 >= 0 && y1 >= 0 && y2 >= 0) {
            rs1 = Math.abs(x2 - x1);
            rs1 = rs1 <= 7 ? Math.abs(y2 - y1) : rs1;
        }
            return rs1;
        }
}