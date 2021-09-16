package HarryPotter;

import java.util.ArrayList;
import java.util.List;

public class WizardsRepository {

    public static List<Wizard> getWizardsList(){
        List<Wizard> wizards = new ArrayList<>();
        wizards.add(new Wizard("Hermione Granger", 15, "Gryffindor", 110));
        wizards.add(new Wizard("Albus Dumbledore", 115, "Gryffindor", 450));
        wizards.add(new Wizard("Luna Lovegood", 15, "Ravenclaw", 100));
        wizards.add(new Wizard("Molly Weasley", 44, "Gryffindor", 240));
        wizards.add(new Wizard("Severus Snape", 52, "Slytherin", 310));
        wizards.add(new Wizard("Tom Riddle", 95, "Slytherin", 410));
        wizards.add(new Wizard("Cedric Diggory", 18, "Hufflepuff", 100));
        wizards.add(new Wizard("Draco Malfoy", 15, "Slytherin", 90));
        wizards.add(new Wizard("Harry Potter", 15, "Gryffindor", 120));
        wizards.add(new Wizard("Ron Weasley", 15, "Gryffindor", 100));
        return wizards;
    }

}
