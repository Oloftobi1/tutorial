import arrayofobjects.Student;

import java.util.ArrayList;

public class SortingSeachingusingComperator {
    public static void main(String[] args) {
        ArrayList<Student> psy101 = new ArrayList<Student>();

        psy101.add(new Student("Anna",2.1));
        psy101.add(new Student("Julia",1.3));
        psy101.add(new Student("Tobi",3.8));

        printStudents(psy101);

        System.out.println("SORT BY NAME");
        printStudents(psy101);

        System.out.println("SORT BY GPA");
        printStudents(psy101);

    }
        public static void printStudents(ArrayList<Student> students){
            System.out.printf("Student\tGPA\n");
            for(Student s : students){
                System.out.printf("%s\n",s);
            }
            System.out.println();
    }
}
