package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Dodge;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Dodge> dodgeList = new ArrayList<>();
        Dodge dodge1970 = new Dodge(50);
        Dodge dodgeRam = new Dodge(65);
        Dodge dodgeChallenger = new Dodge(75);

        dodgeList.add(dodge1970);
        dodgeList.add(dodgeRam);
        dodgeList.add(dodgeChallenger);

        dodgeList.remove(1);
        dodgeList.remove(new Dodge(75));

        System.out.println(dodgeList.size());

        for (Dodge dodge : dodgeList) {
            CarUtils.describeCar(dodge);
        }
    }
}