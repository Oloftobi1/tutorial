package testing;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String marke;
        int ps;
        Auto[] audi = new Auto[4];

        ArrayList<Auto> ferrari = new ArrayList<Auto>();
        ferrari.add(new Auto("Ferrari", 90));
        ferrari.add(new Auto("Lamborghini", 180));
        ferrari.add(new Auto("Pugati", 250));
        ferrari.add(new Auto("Masserati", 300));
// this will run the hole collection
        for (Auto s : ferrari) {
            System.out.printf("%d %s %d ps \n", s.marke(),s.ps());
        }
            for (int i = 0; i<ferrari.size();i++){
                System.out.printf("%s\n",ferrari.get(i));
            }

    }
}
