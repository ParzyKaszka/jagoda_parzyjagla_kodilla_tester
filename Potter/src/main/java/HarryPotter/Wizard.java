package HarryPotter;

import java.util.List;
import java.util.Objects;

public class Wizard {
    private String name;
    private int age;
    private String home;
    private int health;
    public List<Spell> spells = BookOfSpells.getBookOfSpells();

    public Wizard(String name, int age, String home, int health) {
        this.name = name;
        this.age = age;
        this.home = home;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }
    public void setHealth(int health){
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home){
        this.home = home;
    }

    public void castSpell(String spell){
        for(Spell spell2 : spells){
            if(spell2.getSpell().equals(spell)){
                spell = spell2.getAction();
                System.out.println(spell);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wizard wizard = (Wizard) o;
        return age == wizard.age && Objects.equals(name, wizard.name) && Objects.equals(home, wizard.home);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, home);
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", home='" + home + '\'' +
                ", health=" + health +
                '}';
    }
}
