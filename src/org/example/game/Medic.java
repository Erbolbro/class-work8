package org.example.game;

public class Medic extends Hero {
    public Medic(int health, int damage, String name) {
        super(health, damage, SuperAbility.HELPING_PERSON, name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (!heroes[i].getName().equals(this.getName()) && this.getHealth() > 0 && heroes[i].getHealth() > 0 && heroes[i].getHealth() < 100) {
                heroes[i].setHealth(heroes[i].getHealth()+10);
                System.out.println(getName() + " ВЫЛЕЧИЛ " + heroes[i].getName());
                break;
            }
        }
    }
}
