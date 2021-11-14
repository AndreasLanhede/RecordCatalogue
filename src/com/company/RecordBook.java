package com.company;
import java.util.Collections;
import java.util.List;


public class RecordBook {

    //Constructor
    public RecordBook(List<Integer> grades) {
        studentGrades = grades;
    }

    //States
    private List<Integer> studentGrades;

    //Behaviour
    public List<Integer> getStudentGrades() {
        return studentGrades;
    }
    public double CalcAverage() {
        double total = 0;
        for (var g : studentGrades
        ) {
            total = total + g;
        }
        var average = total / studentGrades.size();
        return average;
    }
    public int CalcMax(){
        Collections.sort(studentGrades);
        return studentGrades.get(studentGrades.size() - 1);
    }
    public int CalcMin(){
        Collections.sort(studentGrades);
        return studentGrades.get(0);
    }
}

