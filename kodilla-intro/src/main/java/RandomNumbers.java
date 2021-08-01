import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {
        Random r = new Random();

        int min = 31;
        int max = 0;
        int sum = 0;

        while (sum < 5000) {
            int a = r.nextInt(31);
            sum = sum + a;
            System.out.println(sum);
            min = Math.min(a, min);
            max = Math.max(a, max);
        }

        System.out.println(min);
        System.out.println(max);

    }
}