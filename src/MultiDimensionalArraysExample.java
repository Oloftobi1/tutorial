import jdk.nashorn.internal.runtime.JSONFunctions;

public class MultiDimensionalArraysExample {
    public static void main(String[] args) {
        int u = 5;
       int l = u>2?1:2;
        System.out.println(l);
        char[][] board = new char[3][3];
        board[0][0] ='X';
        board[1][1] = 'W';
        board[2][0] = 'X';
        board[1][2] = 'O';
        board[2][2] = 'O';
        for (int i=0; i<board.length;i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.printf("[%d][%d] =%s", i, j, board[i][j]);
            }
            System.out.println();
        }
    }
}
