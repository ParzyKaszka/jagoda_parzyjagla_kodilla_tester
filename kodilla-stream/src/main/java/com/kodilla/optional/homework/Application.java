package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ron", new Teacher("McGonagall")));
        studentList.add(new Student("Crab", new Teacher("Snape")));
        studentList.add(new Student("Neville", null));
        studentList.add(new Student("Cedric", null));


        for (Student student : studentList) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            String teacherName = optionalTeacher.orElse(new Teacher("<undefined>")).getName();
            System.out.println("Student: " + student.getName() + ", Teacher: " + teacherName);
        }
    }
}