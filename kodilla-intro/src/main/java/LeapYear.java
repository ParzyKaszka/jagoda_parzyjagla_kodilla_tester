public class LeapYear {
    public static void main(String[] args) {
        int year = 2100;
        int four = year % 4;
        int fourHundred = year % 400;
        int hundered = year % 100;

        if (four > 0) {
            System.out.println("Rok nie jest przestępny");
        } else if (four == 0 && hundered > 0) {
            System.out.println("Rok jest przestępny");
        } else if (four == 0 && hundered == 0 && fourHundred == 0) {
            System.out.println("Rok jest przestępny");
        } else {
            System.out.println("Rok nie jest przestępny");
        }


    }


}
