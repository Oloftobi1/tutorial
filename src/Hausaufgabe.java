
import java.util.Scanner;

public class Hausaufgabe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Gib den ISBN Code ein der Erste Buchstabe soll in einer Zahl angegeben werden :\n A = 1\n B = 2\n C = 3\n... ");
           String isbn = input.nextLine();
           int x = 0;
           int quer = 0;
           for (int i = 0;i<isbn.length();i++) {
               char result = isbn.charAt(x);
               int a = isbn.charAt(x);
               int isbnResult = a-48;
               quer = quer+isbnResult;
               System.out.print(isbnResult);
                x++;
           }
        System.out.println();
        System.out.println(quer);
        int num = quer%9;
        System.out.println(num);
        System.out.println(7-num);

    }
}
