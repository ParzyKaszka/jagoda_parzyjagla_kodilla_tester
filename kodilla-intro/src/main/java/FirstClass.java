public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook("600g", 1000);
        Notebook heavyNotebook = new Notebook("2000g", 1500);
        Notebook oldNotebook = new Notebook("1200g", 500);

        extracted(notebook);
        extracted(heavyNotebook);
        extracted(oldNotebook);
    }

    private static void extracted(Notebook notebook) {
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPrice();
    }
}