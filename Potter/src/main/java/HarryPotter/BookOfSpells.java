package HarryPotter;

import java.util.ArrayList;
import java.util.List;

public class BookOfSpells {


    public static List<Spell> getBookOfSpells(){
        List<Spell> bookOfSpells = new ArrayList<>();
        bookOfSpells.add(new Spell("Alohomora!", "Lock open.", 0, "Utility"));
        bookOfSpells.add(new Spell("Aguamenti!", "Water from the wand.", 0, "Utility"));
        bookOfSpells.add(new Spell("Anapneo!", "Clears the respiratory tract.", 10, "Healing"));
        bookOfSpells.add(new Spell("Avada Kedavra!", "Kills.", -500, "Attack"));
        bookOfSpells.add(new Spell("Brachiabindo!", "Fetter the victim with invisible ties.", 0, "Attack"));
        bookOfSpells.add(new Spell("Brackium Emendo!", "Treatment of a broken bone.", 30, "Healing"));
        bookOfSpells.add(new Spell("Capacious extremis!", "Increasing the volume inside and reducing weight.", 0, "Utility"));
        bookOfSpells.add(new Spell("Colloportus!", "Lock closed.", 0, "Utility"));
        bookOfSpells.add(new Spell("Confundus!", "Confused.", 0, "Attack"));
        bookOfSpells.add(new Spell("Cruciatus!", "Paralyzing pain.", -30, "Attack"));
        bookOfSpells.add(new Spell("Depulso!", "Strong push back.", -20, "Attack"));
        bookOfSpells.add(new Spell("Diffindo!", "Stretching.", 0, "Utility"));
        bookOfSpells.add(new Spell("Duro!", "Turning an item into stone.", 0, "Utility"));
        bookOfSpells.add(new Spell("Enervate!", "Healing.", 50, "Healing"));
        bookOfSpells.add(new Spell("Erecto!", "Item disappears.", 0, "Utility"));
        bookOfSpells.add(new Spell("Expecto Patronum!", "Conjure a patronus.", 0, "Utility"));
        bookOfSpells.add(new Spell("Expelliarmus!", "Tear out the wand.", 0, "Attack"));
        bookOfSpells.add(new Spell("Ferula!", "Immobilize a broken leg.", 10, "Healing"));
        bookOfSpells.add(new Spell("Filipendo!", "Pushes a heavy object.", 0, "Utility"));
        bookOfSpells.add(new Spell("Homenum Revelio!", "Reveals human presence.", 0, "Utility"));
        bookOfSpells.add(new Spell("Imperio!", "Taking control.", 0, "Attack"));
        bookOfSpells.add(new Spell("Incendio!", "Set on fire.", -35, "Attack"));
        bookOfSpells.add(new Spell("Locomotor Mortis!", "Gluing the legs.", 0, "Attack"));
        bookOfSpells.add(new Spell("Lumos!", "Light on.", 0, "Utility"));
        bookOfSpells.add(new Spell("Morsmordre!", "Conjure a Dark Mark.", 0, "Utility"));
        bookOfSpells.add(new Spell("Nox!", "Light off.", 0, "Utility"));
        bookOfSpells.add(new Spell("Obliviate!", "Memory removal.", 0, "Attack"));
        bookOfSpells.add(new Spell("Petrificus Totalus!", "Paralysis.", 0, "Attack"));
        bookOfSpells.add(new Spell("Protego!", "Magic barrier.", 0, "Defense"));
        bookOfSpells.add(new Spell("Piertotum Locomotor!", "The statue becomes alive.", 0, "Utility"));
        bookOfSpells.add(new Spell("Rennervate!", "Heals paralysis.", 0, "Defense"));
        bookOfSpells.add(new Spell("Reparo!", "Repairs the item.", 0, "Utility"));
        bookOfSpells.add(new Spell("Sectumsempra!", "Deep wounds on the body.", -100, "Attack"));
        bookOfSpells.add(new Spell("Sillencio!", "Mute the sound.", 0, "Utility"));
        bookOfSpells.add(new Spell("Wingardium Leviosa", "Levitation of an object", 0, "Utility"));
        return bookOfSpells;
    }
}
