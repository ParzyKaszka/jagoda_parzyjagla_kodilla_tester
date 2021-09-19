package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avg = UsersRepository.getUserList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .map(User::getAge)
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(avg);

        double avg2 = UsersRepository.getUserList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .map(User::getAge)
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(avg2);
    }
}