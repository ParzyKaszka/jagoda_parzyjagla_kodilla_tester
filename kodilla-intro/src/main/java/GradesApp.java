public class GradesApp {
    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(5);
        grades.add(2);
        grades.add(1);
        grades.add(2);
        grades.add(4);
        System.out.println("Ostatnio dodana ocena to " + grades.getLastAdded());
        grades.add(5);
        grades.add(6);
        grades.add(6);
        grades.add(3);
        grades.add(3);
        System.out.println("Średnia wszystkich ocen to " + grades.getAvgGrade()); //oczekiwana średnia 3.7
        System.out.println("Ostatnia dodana ocena to " + grades.getLastAdded());
    }
}
