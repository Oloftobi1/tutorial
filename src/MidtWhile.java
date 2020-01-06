import java.util.Random;
import java.util.Scanner;

public class MidtWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random generator = new Random();
        int number = generator.nextInt(10)+1;
        int guess;
        int attempt = 1;
        System.out.println("Im Thinking of a Number between 1 and 10 what is it ? ");
        while (true){

            System.out.printf("Attempt %d, Enter your Answer : ",attempt);
            guess = input.nextInt();

            if (number==guess){
                System.out.printf("it took you %d attempts, Congratulations ",attempt);
                break;
            }
            else if(guess<1 || guess>10){
                System.out.println("Its not in the Range you Retard");
            }
            else{
                System.out.println("Thats not the Answer, try it Again");
                attempt++;
            }
        }
    }
}
