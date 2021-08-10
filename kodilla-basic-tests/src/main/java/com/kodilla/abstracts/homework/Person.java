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
        Chief chief = new Chief();
        Manager manager = new Manager();
        Instructor instructor = new Instructor();
        RestaurantWorker restaurantWorker = new RestaurantWorker();

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