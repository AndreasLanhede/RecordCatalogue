package com.company;

import java.util.ArrayList;
import java.util.List;

public class RecordCatalogue {

    //Constructor
    public RecordCatalogue (String nameOfSchool){
        schoolName=nameOfSchool;
        students = new ArrayList<>();
    }

    //States
    private List <Student> students;
    private String schoolName;

    //Behaviour
    public List<Student> getStudents() {
        return students;
    }
    public String getSchoolName() {
        return schoolName;
    }
    public void addStudent(Student s){
        students.add(s);
    }





}


