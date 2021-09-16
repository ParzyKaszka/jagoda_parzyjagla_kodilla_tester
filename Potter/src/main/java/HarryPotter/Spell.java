package HarryPotter;

import java.util.Objects;

public class Spell {
     private String spell;
     private String action;
     private int damage;
     private String type;

    public Spell(String spell, String action, int damage, String type) {
        this.spell = spell;
        this.action = action;
        this.damage = damage;
        this.type = type;
    }

    public String getSpell() {
        return spell;
    }

    public String getAction() {
        return action;
    }

    public int getDamage() {
        return damage;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spell spell1 = (Spell) o;
        return damage == spell1.damage && Objects.equals(spell, spell1.spell) && Objects.equals(action, spell1.action) && Objects.equals(type, spell1.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spell, action, damage, type);
    }

    @Override
    public String toString() {
        return "Spell{" + "spell='" + spell + '\'' + ", action='" + action + '\'' +
                ", damage=" + damage +
                ", type='" + type + '\'' +
                '}';
    }
}
