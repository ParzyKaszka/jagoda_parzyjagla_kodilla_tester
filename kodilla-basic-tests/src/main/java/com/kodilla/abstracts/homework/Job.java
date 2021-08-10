package com.kodilla.abstracts.homework;

public abstract class Job {
    private int salary;
    private String responsibilities;

    public Job(int salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
    }

    public void salary() {
        System.out.println(salary);
    }

    public void responsibilities() {
        System.out.println(responsibilities);
    }
}