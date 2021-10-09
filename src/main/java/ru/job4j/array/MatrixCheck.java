package ru.job4j.array;

public class MatrixCheck {

    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            for (int cell = 0; cell < board[row].length; cell++) {
                if (board[i][cell] != 'X') {
                    result = false;
                    break;
                } else {
                    return true;
                }
            }
        }
        return result;
    }
}
