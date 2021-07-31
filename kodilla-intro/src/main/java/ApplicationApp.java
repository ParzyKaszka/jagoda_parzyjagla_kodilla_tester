public class ApplicationApp {
    public static void main(String[] args) {
        Application czlowiek = new Application("Adam", 40.5, 178);

        if ( czlowiek.age > 30 && czlowiek.height > 160) {
            System.out.println("User is older than 30 and higher than 160cm");
        } else {
            System.out.println("User is 30 (or younger) or 160cm (or shorter)");
        }
    }
}