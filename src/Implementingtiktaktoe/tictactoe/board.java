package Implementingtiktaktoe.tictactoe;

import com.sun.org.apache.bcel.internal.classfile.SourceFile;

public class board {
    public Marker[][] board;

    public board() {
        this.board = new Marker[3][3];
        this.clear();
    }

    public board(Marker[][] theboard) {
        this.board = theboard;
    }

    public final void clear() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                this.board[i][j] = Marker.EMPTY;
            }
        }
    }
    public void Draw() {
        System.out.printf("\n 0 1 2\n");
        for (int i = 0; i < board.length; i++) {
            System.out.printf("%d ", i);
            for (int j = 0; j < board.length; j++) {
                    System.out.printf("%s!", board[i][j]);
            }
            System.out.printf("\n");
            if (i < 2) {
                System.out.printf("  -+-+-+\n");
            }
        }

    }
    public boolean Place(Marker marker, int row, int col) {
        if (this.board[row][col] == Marker.EMPTY) {
            this.board[row][col] = marker;
            return true;
        }
        else{
                return false;
            }


    }
}




