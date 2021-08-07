import java.util.Scanner;

public class JakiKon {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want a horse? (yes or no)");
        String want = scanner.nextLine();
        if (want.equals("no")) {

            System.out.println("Oh, ok....");

        } else if (want.equals("yes")) {
            while (true) {
                System.out.println("How big?(big, medium or small)");
                String size = scanner.nextLine();
                if (size.equals("big")) {
                    System.out.println("Shire");
                } else if (size.equals("medium")) {
                    System.out.println("Małopolak");
                } else if (size.equals("small")) {
                    System.out.println("kuc szetlandzki");
                } else {
                    System.out.println("Nie rozumiem");
                }
                break;
            }
            System.out.println("Kozacko!");
        }
    }
}