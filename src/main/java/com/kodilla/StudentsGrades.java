package com.kodilla;
import java.util.*;

public class StudentsGrades {
    ArrayList<Integer> GradesArray;

    public StudentsGrades(ArrayList<Integer>GradesArray) {
        this.GradesArray = GradesArray;
    }

    //method count students grades average.
    public Double gradesAverage() {

        int grq = GradesArray.size();
        double gradeSum = 0;
        double average;

        for(Integer digit : GradesArray) {
            gradeSum += digit;
        }
        if(grq > 0) {
            average = gradeSum/grq;

        }else {
            average = 0.0;
        }
        return average;
    }
    @Override
    public String toString() {
        return "Student's grades average = " + gradesAverage();
    }
}
