package com.example.demo.Problema1;

import java.util.ArrayList;

public class Archer extends Hero {
    public Archer(String name, int level, int experience, ArrayList<Skill> skills, Appearance appearance) {
        super(name, level, experience, skills, appearance);
    }

    @Override
    public Hero clone() {
        System.out.println("Cloning archer...");
        return new Archer(this.name, this.level, this.experience, this.skills, this.appearance);
    }

    @Override
    public void personalize() {
        System.out.println("Personalizing archer...");
    }
}