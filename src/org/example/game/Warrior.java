package org.example.game;

import java.util.Random;

public class Warrior extends Hero {

    public Warrior(int health, int damage,  String name) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE, name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random random = new Random();
        int coef = random.nextInt( 3) +2;
        boss.setHealth(boss.getHealth() - this.getDamage() * coef);
        System.out.println(this.getName() + "hist critically " + coef * this.getDamage());
    }
}

