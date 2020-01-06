import java.util.Scanner;

public class forloopsBasics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How long you wanna count ? ");
        int max = input.nextInt();
        System.out.println("Counting up...");
        for (int i = 1;i<= max;i++){
            System.out.println(i);
        }
    }
}
