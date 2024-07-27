package com.example.demo.Problema1;

public class Skill {
    private String name;
    private int damage;
    private int energyCost;
    private int cooldown;
    private int range;

    public Skill(String name, int damage, int energyCost, int cooldown, int range) {
        this.name = name;
        this.damage = damage;
        this.energyCost = energyCost;
        this.cooldown = cooldown;
        this.range = range;
    }

    public String getName() {
        return this.name;
    }

    public int getDamage() {
        return this.damage;
    }

    public int getEnergyCost() {
        return this.energyCost;
    }

    public int getCooldown() {
        return this.cooldown;
    }

    public int getRange() {
        return this.range;
    }

    public void setName(String name) {this.name = name;}

    protected Skill clone() {
        return new Skill(this.name, this.damage, this.energyCost, this.cooldown, this.range);
    }

}