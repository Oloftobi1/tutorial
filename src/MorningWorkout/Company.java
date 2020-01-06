package MorningWorkout;

public class Company {
    int age;
    int salary;
    static String company;

        public void show(){
            System.out.printf("Age : %d\n Salary : %d\n Company : %s\n",this.age,this.salary,this.company);
        }
        public static class Worker{


            public void show(){
                System.out.println("Hello");
            }
        }

}