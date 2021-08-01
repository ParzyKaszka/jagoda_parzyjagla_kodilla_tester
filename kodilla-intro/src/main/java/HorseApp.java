public class HorseApp {
    public static void main(String[] args) {
        Horse kary = new Horse("kary", "małopolak");
        Horse drugi = new Horse("siwy", "shire");
        Horse[] konie = new Horse[10];
        konie[0] = kary;
        konie[1] = drugi;
        konie[2] = new Horse("kasztan", "pinto");

        System.out.println(kary.getMasc() + " " + kary.getRasa());
        System.out.println(drugi.getMasc() + " " + drugi.getRasa());
        System.out.println(konie[2].getMasc() + " " + konie[2].getRasa());
        konie[2].konBiega();

    }
}