package com.kodilla.abstracts.homework;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public static void main(String[] args) {
        Chief chief = new Chief(5000, "restaurant management, hiring employees");
        Manager manager = new Manager(3000, "employee management, change management");
        Instructor instructor = new Instructor(2500, "staff training, kitchen management");
        RestaurantWorker restaurantWorker = new RestaurantWorker(2100, "Work in the kitchen, customer service");

        Person bogusia = new Person("Bogusia", 38, chief);
        Person karolina = new Person("Karolina", 27, manager);
        Person renata = new Person("Renata", 34, instructor);
        Person pawel = new Person("Paweł", 24, restaurantWorker);

        bogusia.job.responsibilities();
        karolina.job.responsibilities();
        renata.job.salary();
        System.out.println(pawel.age);
    }
}