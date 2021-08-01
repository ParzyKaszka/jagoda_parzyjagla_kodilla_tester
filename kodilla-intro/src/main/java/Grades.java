public class Grades {
    private int[] grades;
    private int index;

    public Grades() {
        this.grades = new int[10];
        this.index = 0;
    }

    public void add(int addGrade) {
        if (this.index == 10) {
            return;
        }

        this.grades[this.index] = addGrade;
        this.index++;
    }

    public int[] getGrades() {
        return grades;
    }

    public float getAvgGrade() {
        float gradesSum = 0;
        for (int i = 0; i < this.index; i++) {
            gradesSum = gradesSum + this.grades[i];
        }
        return gradesSum / this.index;
    }

    public int getLastAdded() {
        return this.grades[this.index - 1];
    }
}