package com.kodilla.abstracts.basic_assertion.school;

import com.kodilla.school.Grades;
import com.kodilla.school.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class GradesTestSuite {
    @Test
    public void shouldHaveZeroLength(){  //czy tablica ma zero wartości
        Grades grades = new Grades();  //obiekt klasy
        int[] values = grades.getValues();  //tablica równa się tablica
        assertEquals(0, values.length); //oczekujemy 0 w długości tablicy
    }

    @Test
    public void shouldAddTwoElementsToArray(){
        Grades grades = new Grades();     //stworzyliśmy obiekt grades czyli nową tablicę
        grades.add(4);         //dodaliśmy 2 do tablicy
        grades.add(2);            //dodaliśmy 4 do tablicy

        int[] values = grades.getValues();      //tablica values = wygenerowana tablica obiektu grades
        assertEquals(2, values.length);  //oczekiwana długość 2
        assertEquals(4, values[0]);      //oczekiwany index 0 = 4
        assertEquals(2, values[1]);      //oczekiwany index 1 = 4

    }

    @Test
    public void shouldCalculateAverage(){
        Grades grades = new Grades();
        grades.add(4);
        grades.add(2);
        grades.add(5);

        assertEquals(3.66, grades.getAverage(), 0.01);
    }

    @Test
    public void shouldCalculateCorrectAveragesIfValuesAreInRange(){
        Student student = new Student("Martin");
        student.addGeographyGrade(4);
        student.addGeographyGrade(4);
        student.addGeographyGrade(2);

        student.addHistoryGrade(1);
        student.addHistoryGrade(5);

        double geographyAverage = student.getGeographyAverage();
        double historyAverage = student.getHistoryAverage();
        double mathsAverage = student.getMathsAverage();
        double physicsAverage = student.getPhysicsAverage();

        assertEquals(3.33, student.getGeographyAverage(), 0.01);
        assertEquals(3,student.getHistoryAverage(), 0.01);
        assertEquals(0, student.getMathsAverage(), 0.01);
        assertEquals(0,student.getPhysicsAverage(), 0.01);

    }
    @Test
    public void shouldReturnAverageEqualsZeroIsArrayIsEmpty() {
        Grades grades = new Grades();
        assertEquals(0, grades.getAverage(), 0.0001);
    }
    @Test
    public void shouldCalculateAveragesIfValuesAreOutsideRange() {
        Student student = new Student("Martin");
        student.addGeographyGrade(-2);
        student.addGeographyGrade(4);
        student.addGeographyGrade(8);

        student.addMathsGrade(0);

        student.addPhysicsGrade(19);
        student.addPhysicsGrade(3);
        student.addPhysicsGrade(3);

        double geographyAverage = student.getGeographyAverage();
        double historyAverage = student.getHistoryAverage();
        double mathsAverage = student.getMathsAverage();
        double physicsAverage = student.getPhysicsAverage();

        assertEquals(4, geographyAverage, 0.01);
        assertEquals(0, historyAverage, 0.01);
        assertEquals(0, mathsAverage, 0.01);
        assertEquals(3, physicsAverage, 0.01);

    }
    @Test
    public void averageShouldBeZeroIfStudentDontHaveGrades() {
        Student student = new Student("Martin");
        assertEquals(0, student.getAverage(), 0.0001);
    }

    @Test
    public void shouldCalculateStudentAverage() {
        Student student = new Student("Martin");
        student.addGeographyGrade(4);
        student.addGeographyGrade(4);
        student.addGeographyGrade(2);
        student.addGeographyGrade(-2);
        student.addGeographyGrade(4);
        student.addGeographyGrade(8);

        student.addHistoryGrade(1);
        student.addHistoryGrade(5);

        student.addMathsGrade(0);

        student.addPhysicsGrade(19);
        student.addPhysicsGrade(3);
        student.addPhysicsGrade(3);
        assertEquals(2.375, student.getAverage(), 0.001);
    }
}
