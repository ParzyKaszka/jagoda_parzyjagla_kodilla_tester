package com.kodilla.school;

public class Grades {

    private int[] values;
    private int size;

    public Grades() {
        this.size = 0;
        this.values = new int[0];  //pusta tablica
    }

    public void add(int value) {        //dodanie wartości do tablicy
        this.size++;                    //zmienna wynosi 1
        int[] newTab = new int[this.size];         //nowa tablica o rozmiarze 1
        System.arraycopy(values, 0, newTab, 0, values.length); // pierwsza tablica, index, nowa tablica, index
        newTab[this.size - 1] = value; //wartość przypisana do indexu
        this.values = newTab;
    }

    public int[] getValues() {
        return values;
    }  //metoda wywołująca gotową tablicę

    public double getAverage(){    //metoda wywołująca średniąocen
        if (this.values.length == 0){
            return 0;
        }
        double sum = 0;              //suma ocen wynosi 0
        for (int i = 0; i < this.values.length; i++){       //wykonuj dopóki i(index) będzie mniejsze od długości
            sum += this.values[i];         //dodaj ocenę z podanego indexu do zmiennej sum
        }
        //if będzie się wykonywać do końca tablicy, do zmiennej sum będą dodawać się po kolei oceny
        return sum/this.values.length;     //zwróć sumę ocen podzieloną na długość tablicy
    }
}
