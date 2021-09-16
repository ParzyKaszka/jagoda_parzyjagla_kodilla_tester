package HarryPotter;

public class Test {
    public static void main(String[] args) {
        WizardsManager wizardsManager = new WizardsManager();
        wizardsManager.removeWizard("Albus Dumbledore");
        System.out.println(wizardsManager);
        System.out.println(wizardsManager.castSpell("Lumos!"));
    }
}
