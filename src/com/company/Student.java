package com.company;

public class Student {

    //Constructor
    public Student (String name, RecordBook book ){
        studentName = name;
        recordBook = book;
    }

    //States
    private String studentName;
    private RecordBook recordBook;

    // Behavior
    public String getStudentName() {
        return studentName;
    }
    public RecordBook getRecordBook() {
        return recordBook;
    }
}
