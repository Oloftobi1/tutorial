import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionBasics {
    public static void main(String[] args) {
     int i = 0;
        boolean done = false;
        do {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter an Integer : ");
            i = input.nextInt();
            done = true;
        }catch (InputMismatchException e){
            System.out.println("You didnt Enter an Integer");
        }finally {
            System.out.println("This happends whether the exception occurs or not");
        }
    }while (!done);
        System.out.printf("You have Entered the Integer %d \n",i);
    }
}
