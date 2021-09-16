package HarryPotter;

import java.util.List;

public class WizardsManager extends WizardsRepository {

    public List<Wizard> wizards = getWizardsList();



    public void addWizard(Wizard wizard){
        wizards.add(wizard);
    }

    public void removeWizard(String name){
        wizards.removeIf(wizard -> wizard.getName().equals(name));
    }



    @Override
    public String toString() {
        return "WizardsManager" + wizards;
    }
}


