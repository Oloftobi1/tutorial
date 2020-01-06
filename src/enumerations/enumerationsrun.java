package enumerations;

import java.util.Scanner;

public class enumerationsrun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Direction tabland = Direction.A;

        System.out.printf("The Directions is %s with %d degrees "
                ,tabland,tabland.Degrees());
    }
}
