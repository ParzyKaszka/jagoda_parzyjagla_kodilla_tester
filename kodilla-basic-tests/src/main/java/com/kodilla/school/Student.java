package com.kodilla.school;

public class Student {

    private String name;
    private Grades maths;
    private Grades physics;
    private Grades geography;
    private Grades history;

    public Student(String name){         //student zawierający oceny z przedmiotów
        this.maths = new Grades();
        this.physics = new Grades();
        this.geography = new Grades();
        this.history = new Grades();
    }

    // metody które pomogą dodać oceny z danego przedmiotu

    public void addMathsGrade(int grade){
        if (grade > 0 && grade < 7){
            this.geography.add(grade);
        }
    }
    public double getMathsAverage(){
        return this.maths.getAverage();
    }

    public void addPhysicsGrade(int grade){
        if (grade > 0 && grade < 7){
            this.physics.add(grade);
        }
    }
    public double getPhysicsAverage(){
        return this.physics.getAverage();
    }

    public void addGeographyGrade(int grade){
        if (grade > 0 && grade < 7){
            this.geography.add(grade);
        }
    }
    public double getGeographyAverage(){
        return this.geography.getAverage();
    }
    public void addHistoryGrade(int grade){
        if (grade > 0 && grade < 7){
            this.history.add(grade);
        }
    }
    public double getHistoryAverage(){
        return this.history.getAverage();
    }
    public double getAverage() {
        double sum = this.geography.getAverage() + this.history.getAverage() + this.maths.getAverage() + this.physics.getAverage();
        return sum/4;
    }
}