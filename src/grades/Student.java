package grades;

import java.util.HashMap;
import java.util.ArrayList;

public class Student {
    private String student;
    private final ArrayList<Integer> grades;
    private final String name;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }
    // returns the student's name
    public String getName(){
        return name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        int sum = 0;
        for(int grade: grades){
            sum += grade;
        }
        return sum/grades.size();
}}
