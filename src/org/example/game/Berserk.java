package org.example.game;

public class Berserk extends Hero{
    public Berserk(int health, int damage, String name) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REWERT, name);
    }
    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        if (this.getHealth() > 0) {
        }
        int bossDamage = boss.getDamage() / 3;
        boss.setHealth(boss.getHealth() - this.getDamage() + bossDamage);
        System.out.println(getName());

    }
}
