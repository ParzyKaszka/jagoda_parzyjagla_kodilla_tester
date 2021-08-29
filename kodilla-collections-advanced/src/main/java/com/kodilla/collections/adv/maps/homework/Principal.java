package com.kodilla.collections.adv.maps.homework;

public class Principal {
    private String name;
    private String lastname;

    public Principal(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name + " " + lastname;
    }

    @Override
    public String toString() {
        return "Principal{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}