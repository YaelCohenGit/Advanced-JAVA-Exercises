package org.Institutions;

import Calculator.dto.Calculate;
import Calculator.dto.Calculate.*;
import org.Institutions.dto.Grade;
import org.Institutions.dto.SchoolClasses;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Grade g = new Grade(9);
        List<Grade> grades = new ArrayList<>();
        grades.add(g);
        SchoolClasses school = new SchoolClasses(grades);
        Calculate c = new Calculate();
        System.out.println(c.calcNumOfStudents(school));
    }
}