package MorningWorkout;
import java.util.Scanner;

public class ArraywithClasses {
    public static void main(String[] args) {
        int grade;
        String name;
        int average = 0;
        Scanner input = new Scanner(System.in);
        Students[] student= new Students[4];
        for (int i = 0; i<student.length;i++) {
            System.out.printf("Enter : \n Name,Grade  \n ",student[i]);
            grade = input.nextInt();
            name = input.nextLine();
            student[i] = new Students(name,grade);
            average = average+grade;
        }
        average = average/student.length;
        System.out.printf("#\tStudent\tGrade\n");
        System.out.printf("-\t-------\t-----\n");
        for(int i =0; i<student.length;i++){
            System.out.printf("%d \t%s \t%d \n",i,student[i].Name(),student[i].Grade());
        }
        System.out.printf("Average Grade of %d ",average);
    }
}
