public class Horse {
    private String masc;
    private String rasa;

    public Horse(String masc, String rasa) {
        this.masc = masc;
        this.rasa = rasa;
    }

    String getMasc() {
        return masc;
    }

    String getRasa() {
        return rasa;
    }

    void konBiega() {
        System.out.println("koń biega");
    }
}