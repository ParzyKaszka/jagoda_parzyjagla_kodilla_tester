package HarryPotter;

import java.util.List;

public class WizardsManager extends WizardsRepository {

    public List<Wizard> wizards = getWizardsList();
    public List<Spell> spells = BookOfSpells.getBookOfSpells();

    public void addWizard(Wizard wizard){
        wizards.add(wizard);
    }

    public void removeWizard(String name){
        wizards.removeIf(wizard -> wizard.getName().equals(name));
    }

    public String castSpell(String spell){
        for(Spell spell2 : spells){
            if(spell2.getSpell().equals(spell)){
                spell = spell2.getAction();
            }
        }
        return spell;
    }

    @Override
    public String toString() {
        return "WizardsManager" + wizards;
    }
}


