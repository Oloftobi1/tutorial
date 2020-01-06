import java.util.Scanner;

public class MultiplesofN {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Whitch Number you wanna Multiply ? ");
        int number = input.nextInt();
        for (int i =1;number>=i;i++){
            int result = i * number;
            System.out.printf("%d times %d equals %d \n ",number,i,result);
        }
    }
}
