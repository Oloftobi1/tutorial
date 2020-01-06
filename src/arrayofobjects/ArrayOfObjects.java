package arrayofobjects;

import javax.swing.*;

public class ArrayOfObjects {
    public static void main(String[] args) {


        Student[] students = new Student[] {
            new Student("Adolf", 88),
            new Student("Bobie", 89),
            new Student("Andreas", 83),
            new Student("Simon", 74),
        };
        System.out.printf("#\tStudent\tGrade\n");
        System.out.printf("-\t-------\t-----\n");
        double sum= 0.0;
        for (int i = 0; i<students.length;i++){
            System.out.printf("%d\t%s\t %d\n",i,students[i].Name(),students[i].Grade());
            sum += students[i].Grade();
        }
        double average = sum/4;
        System.out.printf("The average of the Class members Grade is %f",average);
    }

}
