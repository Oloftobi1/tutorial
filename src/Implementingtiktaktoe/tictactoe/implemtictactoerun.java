package Implementingtiktaktoe.tictactoe;

import java.util.Scanner;

public class implemtictactoerun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row;
        int col;
        board game = new board();

        game.Draw();
        System.out.println("Gibt die Position deines Kreuzes ein (Spalte dann Zeile) : ");
        col = input.nextInt();
         row = input.nextInt();
        game.Place(Marker.X,row,col);
        game.Draw();
        System.out.println("Gibt die Position deines Kreuzes ein (Spalte dann Zeile) : ");
        col = input.nextInt();
        row = input.nextInt();
        game.Place(Marker.X,row,col);
        game.Draw();
        System.out.println("Gibt die Position deines Kreuzes ein (Spalte dann Zeile) : ");
        col = input.nextInt();
        row = input.nextInt();
        game.Place(Marker.X,row,col);
        game.Draw();
        game.clear();
        game.Draw();



    }
}
