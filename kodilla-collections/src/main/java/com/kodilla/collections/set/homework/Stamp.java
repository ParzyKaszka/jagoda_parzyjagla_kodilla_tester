package com.kodilla.collections.set.homework;

import java.util.Objects;

public class Stamp {
    private String nameOfStamp;
    private double stampWidth;
    private double stampHeight;
    private boolean stampedOrNotStamped;

    public Stamp(String nameOfStamp, double stampWidth, double stampHeight, boolean stampedOrNotStamped) {
        this.nameOfStamp = nameOfStamp;
        this.stampWidth = stampWidth;
        this.stampHeight = stampHeight;
        this.stampedOrNotStamped = stampedOrNotStamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.stampWidth, stampWidth) == 0 && Double.compare(stamp.stampHeight, stampHeight) == 0 && Objects.equals(nameOfStamp, stamp.nameOfStamp) && Objects.equals(stampedOrNotStamped, stamp.stampedOrNotStamped);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfStamp, stampWidth, stampHeight, stampedOrNotStamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "nameOfStamp='" + nameOfStamp + '\'' +
                ", stampWidth=" + stampWidth +
                ", stampHeight=" + stampHeight +
                ", stampedOrNotStamped='" + stampedOrNotStamped + '\'' +
                '}';
    }
}