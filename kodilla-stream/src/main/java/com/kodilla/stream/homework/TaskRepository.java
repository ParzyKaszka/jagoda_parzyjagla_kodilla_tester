package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTask() {
        List<Task> toDoList = new ArrayList<>();
        toDoList.add(new Task("Save the world", LocalDate.of(2021, 9, 6), LocalDate.of(2021, 12, 31)));
        toDoList.add(new Task("Buy a tank", LocalDate.of(2021, 10, 17), LocalDate.of(2021, 10, 18)));
        toDoList.add(new Task("Paint the deck", LocalDate.of(2021, 7, 20), LocalDate.of(2021, 8, 23)));
        return toDoList;
    }
}