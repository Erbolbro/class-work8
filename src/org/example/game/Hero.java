package org.example.game;

public abstract class Hero extends GameEntity implements HavingSuperAbility{
    private SuperAbility superAbility;
    private SuperAbility superAbility2;
    private  String name;

    public SuperAbility getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(SuperAbility superAbility) {
        this.superAbility = superAbility;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hero(int health, int damage, SuperAbility ability, String name) {
        super(health, damage);
        this.superAbility = ability;
        this.name = name;

    }
}
