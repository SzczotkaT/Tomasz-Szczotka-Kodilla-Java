package com.kodilla;
import java.util.*;

public class HashMapTest {
    public static void main(String[] args){
        //new students
        Student st1 = new Student("Tina", "Turner", 1);
        Student st2 = new Student("Mike", "Tyson", 2);

        //creating first List of example grades.
        ArrayList<Integer> GradesArray1 = new ArrayList<Integer>();
        StudentsGrades sg1 = new StudentsGrades(GradesArray1);

        GradesArray1.add(5);
        GradesArray1.add(4);
        GradesArray1.add(3);
        GradesArray1.add(6);
        GradesArray1.add(4);

        //creating second List of example grades.
        ArrayList<Integer> GradesArray2 = new ArrayList<Integer>();
        StudentsGrades sg2 = new StudentsGrades(GradesArray2);

        GradesArray2.add(3);
        GradesArray2.add(3);
        GradesArray2.add(4);
        GradesArray2.add(3);
        GradesArray2.add(3);

        //Creating HashMap connecting student with grades.
        HashMap<Student, StudentsGrades> gradesParameters = new HashMap<Student, StudentsGrades>();

        gradesParameters.put(st1, sg1);
        gradesParameters.put(st2, sg2);


        for(Map.Entry<Student, StudentsGrades> entry : gradesParameters.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
