package testing;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OwnExcetpion {
    public static void main(String[] args) {
        int i = 0;
        try{
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a Integer between 1 and 10 : ");
            i = input.nextInt();
            if (i<1 || i>10) throw new  IntegerOutOfRangeException();

        }catch(InputMismatchException ex){
            System.out.println("You didnt Enter an Integer");
            System.out.println(ex);
        }catch(IntegerOutOfRangeException ex){
        System.out.println("Your input is out of Range ");
            System.out.println(ex);
    }
    }
}
