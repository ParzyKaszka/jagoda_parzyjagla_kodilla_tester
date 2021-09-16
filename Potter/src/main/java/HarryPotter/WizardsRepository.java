package HarryPotter;

import java.util.*;

public class WizardsRepository {

    public static List<Wizard> getWizardsList(){
        List<Wizard> wizards = new ArrayList<>();
        Wizard hermione= new Wizard("Hermione Granger", 15, "Gryffindor", 110);
        Wizard albus = new Wizard("Albus Dumbledore", 115, "Gryffindor", 450);
        Wizard luna = new Wizard("Luna Lovegood", 15, "Ravenclaw", 100);
        Wizard molly = new Wizard("Molly Weasley", 44, "Gryffindor", 240);
        Wizard severus = new Wizard("Severus Snape", 52, "Slytherin", 310);
        Wizard tom = new Wizard("Tom Riddle", 95, "Slytherin", 410);
        Wizard cedric = new Wizard("Cedric Diggory", 18, "Hufflepuff", 100);
        Wizard draco = new Wizard("Draco Malfoy", 15, "Slytherin", 90);
        Wizard harry = new Wizard("Harry Potter", 15, "Gryffindor", 120);
        Wizard ron = new Wizard("Ron Weasley", 15, "Gryffindor", 100);
        wizards.add(hermione);
        wizards.add(albus);
        wizards.add(luna);
        wizards.add(molly);
        wizards.add(severus);
        wizards.add(tom);
        wizards.add(cedric);
        wizards.add(draco);
        wizards.add(harry);
        wizards.add(ron);
        return wizards;
    }

}
