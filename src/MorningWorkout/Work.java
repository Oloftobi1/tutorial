package MorningWorkout;

public class Work {
    public static void main(String[] args) {
        Company Alfredo = new Company();
        Company Fernando = new Company();
        Company.Worker Tom = new Company.Worker();
        Tom.show();
        Fernando.age = 20;
        Fernando.salary = 3000;

        Alfredo.age = 20;
        Alfredo.salary = 5000;
        Company.company = "Audi";

        Fernando.show();
        Alfredo.show();

    }

}
