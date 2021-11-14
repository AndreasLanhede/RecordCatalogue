package com.company;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) throws Exception
    {
        List<Student> students = new ArrayList<>();
        List<RecordBook> grades = new ArrayList<>();
        RecordCatalogue catalogue = new RecordCatalogue("Svaneskolan");
        System.out.println("Skolportal för :"+catalogue.getSchoolName());
        File file = new File("listor\\betyg.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        List<String> lines = new ArrayList<>();
        while ((st = br.readLine()) != null) {
            var array = st.split(":");
            List<Integer> namn = new ArrayList<>();
            var betyg = array[1].split(",");
            for (var b : betyg
            ) {
                namn.add(Integer.parseInt(b.trim()));
            }

            catalogue.addStudent(new Student(array[0], new RecordBook(namn)));

        }
        for (var item : catalogue.getStudents()
        ) {
            System.out.println("////////////////////////////");
            System.out.println("Studentens namn :" +item.getStudentName());
            System.out.println("Studentens betyg :" +item.getRecordBook().getStudentGrades());
            System.out.println("Genomsnittligt betyg :" +item.getRecordBook().CalcAverage());
            System.out.println("Lägsta betyg: "+ item.getRecordBook().CalcMin());
            System.out.println("Högsta betyg: "+ item.getRecordBook().CalcMax());
        }
    }
}