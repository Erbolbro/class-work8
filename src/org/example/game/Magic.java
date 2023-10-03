package org.example.game;

public class Magic extends Hero{

    public Magic(int health, int damage,  String name) {
        super(health, damage, SuperAbility.BOOST, name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
         int increase_in_damage= 5;
        for (int i = 0; i < heroes.length; i++) {
            if (this.getHealth()>0){
                heroes[i].setDamage(heroes[i].getDamage() + increase_in_damage);
            }

        }
        System.out.println(this.getName()+" маг использует суперспособности");
    }
}
