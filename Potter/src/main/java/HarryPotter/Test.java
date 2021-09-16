package HarryPotter;


import static HarryPotter.WizardsRepository.hermione;


public class Test {
    public static void main(String[] args) {
        WizardsManager wizardsManager = new WizardsManager();
        wizardsManager.removeWizard("Hermione Granger");
        wizardsManager.addWizard(new Wizard("Minerwa McGonagall", 80,"Gryffindor", 350));
        System.out.println(wizardsManager);
        hermione.castSpell("Lumos!");
    }
}
