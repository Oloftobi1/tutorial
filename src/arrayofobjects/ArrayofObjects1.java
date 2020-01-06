package arrayofobjects;

import java.util.Scanner;

public class ArrayofObjects1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        Double grade;
        Student[] students = new Student[4];
        for (int i=0;i<students.length;i++){
            System.out.printf("Enter Student NAME then GRADE for student ",students[i]);
            grade = input.nextDouble();
            name = input.nextLine();
            students[i] = new Student(name,grade);
        }
        System.out.printf("#\tStudent\tGrade\n");
        System.out.printf("-\t-------\t-----\n");
        for (int i = 0; i<students.length;i++){
            System.out.printf("%d\t%s\t%f\n",i,students[i].Name(),students[i].Grade());
        }


    }

}
