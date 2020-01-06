import java.util.Random;
import java.util.Scanner;

public class PreTestLoopExple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random generator = new Random();
        int number = generator.nextInt(10)+1;
        System.out.println("what number do you think it is ? between 1 and 10");
        int guess = input.nextInt();
        int attempt = 1;
        System.out.println("Im Thinking of a Number between 1 and 10 what is it ? ");
        while (number != guess){
            System.out.printf("%d is Wrong Enter another Number  : \n",guess);
            guess= input.nextInt();
            attempt++;
        }
        System.out.printf("Yes its %d,  \n",number);

        if (attempt<=1) {
            System.out.printf("it took you %d attempts, thats awesome", attempt);
        }
        else if (attempt>1 && attempt<=4){
            System.out.printf("it took you %d attempts, thats good", attempt);
        }
        else if(attempt>4 && attempt<=7){
            System.out.printf("it took you %d attempts, thats okay", attempt);
        }
        else if(attempt>=7 ){
            System.out.printf("it took you %d attempts, thats very bad, try to do it better next time", attempt);
        }


    }
}
