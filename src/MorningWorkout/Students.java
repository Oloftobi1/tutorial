package MorningWorkout;


public class Students {
    public int grades;
    public  String name;

    public Students(String name,int grades){
        this.name = name;
        this.grades = grades;

    }
    public String Name(){
        return this.name;
    }
    public int Grade(){
        return this.grades;
    }
}
