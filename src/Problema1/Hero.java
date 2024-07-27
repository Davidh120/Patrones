package com.example.demo.Problema1;

import java.util.ArrayList;

public abstract class Hero{
    protected String name;
    protected int level;
    protected int experience;
    protected ArrayList<Skill> skills;
    protected Appearance appearance;

    public Hero(String name, int level, int experience, ArrayList<Skill> skills, Appearance appearance) {
        this.name = name;
        this.level = level;
        this.experience = experience;
        this.skills = new ArrayList<Skill>();
        for (Skill skill : skills) {
            this.skills.add(skill.clone());
        }
        this.appearance = appearance.clone();
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract Hero clone();
    public abstract void personalize();
}