package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> classrooms = new ArrayList<>();
    private String name;

    public School(String name, int... classrooms) {
        this.name = name;
        for (int students : classrooms)
            this.classrooms.add(students);
    }

    public int getSumClassrooms() {
        int sum = 0;
        for (int students : classrooms)
            sum += students;
        return sum;
    }

    public List<Integer> getClassrooms() {
        return classrooms;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "School{" +
                "classrooms=" + classrooms +
                ", name='" + name + '\'' +
                '}';
    }
}