import java.util.Scanner;

public class TwoForloops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What number you wanna Multiply ");
        int multi = input.nextInt();
        for (int i = 1;i<=multi;i++){
       for (int j = 1; j<=10;j++){
           int answer = i * j;
           System.out.printf("[%d * %d = %d ] ",i,j,answer);
       }
            System.out.println();
        }
    }
}
