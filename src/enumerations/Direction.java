package enumerations;

import java.util.Scanner;

public enum Direction {

A(1), South(180), East(90), West(270), NorthEast(45)
    ,NorthWest(315),SouthEast(115),SouthWest(225);


    private final int degrees;
    Direction (int degrees) {
        this.degrees = degrees;
    }
    public int Degrees(){
        return this.degrees;
    }
}
