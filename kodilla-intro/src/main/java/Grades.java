public class Grades {
    private int[] grades;
    private int index;

    public Grades() {
        this.grades = new int[10]; //w tablicy może być 10 wartości typu int
        this.index = 0; // np. 3 dodane oceny [ 2, 5, 6, pusto, pusto, pusto...]
    }

    public void add ( int dodawanaOcena){ //metoda która ma dodać ocenę do tablicy (typu int)
        if (this.index == 10) { // jeśli dojdzie do końca tablicy, stop
            return;
        }
        //[pusto, pusto, pusto, pusto, pusto, pusto, pusto, pusto, pusto, pusto]

        this.grades[this.index] = dodawanaOcena; //dodanie oceny do poszczególnego indexu
        // po każdym kolejnym użyciu metody, wartość inexu będzie zwiększać się o 1
        this.index++;
    }

    public int[] getGrades(){
        return grades;
    }

    public float getAvgGrade(){
        float sumaOcen = 0;
        for (int i = 0; i < this.index; i++){
           sumaOcen = sumaOcen + this.grades[i];
        }
        return sumaOcen / this.index;
    }

    public int getLastAdded(){
        return this.grades[this.index - 1];
    }
}