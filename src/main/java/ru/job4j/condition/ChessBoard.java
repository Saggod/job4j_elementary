package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rs1 = 0;
        if (x1 == y2 && x2 == y1) {
            rs1 = Math.abs(x2 - x1);
            rs1 = rs1 <= 7 ? Math.abs(y2 - y1) : rs1;
        }
        return rs1;
    }
}
