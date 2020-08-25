package com.company;

public abstract class Hero implements HavingSuperAbility {
    private int health;
    private int damage;
    HavingSuperAbility superAbility;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public HavingSuperAbility getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(HavingSuperAbility superAbility) {
        this.superAbility = superAbility;
    }
}
