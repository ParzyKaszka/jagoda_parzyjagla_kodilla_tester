public class SimpleArray {
    public static void main(String[] args) {
        String[] bestBooks = new String[]{"Malowany Człowiek", "Zemsta", "Chemia Śmierci", "Dom Skorpiona", "Harry Potter i kamień filozoficzny"};
        String bestPathologist = bestBooks[2];
        System.out.println(bestPathologist);
        int howManyBooks = bestBooks.length;
        System.out.println("Jest tutaj aż " + howManyBooks + " zajebistych książek");

    }
}
