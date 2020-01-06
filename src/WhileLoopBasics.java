import java.util.Scanner;

public class WhileLoopBasics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How long will you count ? ");
        int count = input.nextInt();
        int i = 1;
        System.out.println("Counting Up...");
        while (i<=count) {
            System.out.printf("%d ",i);
            i++;
        }
        System.out.println();
        i = count;
        System.out.println("Counting down...");
        while (i>=0){
            System.out.printf("%d ",i);
            i--;
        }
        System.out.println();
    }
}
