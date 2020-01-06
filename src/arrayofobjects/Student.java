package arrayofobjects;

import org.junit.Test;

public class Student {
    private String _name;
    private double _grade;

    public Student(String name,double grade){
        this._name = name;
        this._grade = grade;
    }

    public String Name(){
        return this._name;
    }
    public double Grade(){
        return this._grade;
    }

}
