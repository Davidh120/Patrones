package com.example.demo.Problema1;

import java.util.ArrayList;

public class Mage extends Hero {
    public Mage(String name, int level, int experience, ArrayList<Skill> skills, Appearance appearance) {
        super(name, level, experience, skills, appearance);
    }

    @Override
    public Hero clone() {
        System.out.println("Cloning mage...");
        return new Mage(this.name, this.level, this.experience, this.skills, this.appearance);
    }

    @Override
    public void personalize() {
        System.out.println("Personalizing mage...");
    }
}