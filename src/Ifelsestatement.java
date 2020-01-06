import java.util.Scanner;

public class Ifelsestatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your grade a number between 0 and 100");
        int grade = input.nextInt();
        if (grade>=0 && grade<=100){
        if (grade<70) {
            System.out.println("Your not a good studient");
        }
        else if (grade>70 && grade<90){
            System.out.println("You are a good studient");
        }
        else if (grade>=90 && grade<=100){
            System.out.println("you are a very good studient");
        }
        }
        else{
                System.out.println("your grade is out of the Range");
            }

    }
}