package com.example.demo.Problema1;

import java.util.ArrayList;

public abstract class Hero{
    protected String name;
    protected int level;
    protected int experience;
    protected ArrayList<Skill> skills;
    protected Appearance appearance;

    public Hero(String name, int level, int experience, List<Skill> skills, Appearance appearance) {
        this.name = name;
        this.level = level;
        this.experience = experience;
        this.skills = new ArrayList<>(skills);
        this.appearance = appearance.clone();
    }

    public abstract Hero clone();
    public abstract void personalize();
}