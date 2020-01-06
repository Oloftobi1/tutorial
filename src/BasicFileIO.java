import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BasicFileIO {
    public static void main(String[] args) {


        File file = new File("test.txt");


        try {
            PrintWriter output = new PrintWriter(file);
            output.println("Tobias Kofler");
            output.println(18);
            output.close();
        } catch (IOException ex) {
            System.out.printf("Error %s \n",ex);
        }

        try {
            Scanner input = new Scanner(file);
            String name = input.nextLine();
            int age = input.nextInt();
            System.out.printf("Name : %s \nAge : %d \n",name,age);
            input.close();
        }catch (FileNotFoundException ex){
            System.out.printf("Error %s \n ",ex);
        }
    }
}
