package com.example.demo.Problema1;

import java.util.ArrayList;

public class HeroTest {

    public static void main(String[] args) {
        // Crear Skilles
        Skill Skill1 = new Skill("Ataque Poderoso", 100, 20, 5, 10);
        Skill Skill2 = new Skill("Escudo Mágico", 0, 10, 3, 0);

        ArrayList<Skill> skills = new ArrayList<>();
        skills.add(Skill1);
        skills.add(Skill2);

        // Crear Appearance inicial
        Appearance AppearanceInicial = new Appearance("Moreno", "armadura de cuero", "largo");

        // Crear un Warrior
        Warrior WarriorOriginal = new Warrior("Warrior1", 1, 0, skills, AppearanceInicial);
        
        // Clonar el Warrior
        Warrior WarriorClonado = (Warrior) WarriorOriginal.clone();

        // personalize el clon
        WarriorClonado.personalize();

        // Mostrar información del Warrior original y del clonado
        System.out.println("Warrior Original:");
        mostrarHeroInfo(WarriorOriginal);
        
        System.out.println("\nWarrior Clonado:");
        mostrarHeroInfo(WarriorClonado);

        WarriorOriginal.setName("Originalll");
        WarriorOriginal.skills.get(0).setName("Otro");
        WarriorOriginal.appearance.setColor("Negrito");

        // Mostrar información del Warrior original y del clonado
        System.out.println("\nWarrior Original:");
        mostrarHeroInfo(WarriorOriginal);

        System.out.println("\nWarrior Clonado:");
        mostrarHeroInfo(WarriorClonado);
    }

    private static void mostrarHeroInfo(Hero hero) {
        System.out.println("Nombre: " + hero.name);
        System.out.println("Nivel: " + hero.level);
        System.out.println("Experiencia: " + hero.experience);
        System.out.print("Skilles: ");
        for (Skill h : hero.skills) {
            System.out.print(h.name + " (Daño: " + h.getDamage() + ", Costo Energía: " + h.getEnergyCost() + "), ");
        }
        System.out.println("\nAppearance: Color - " + hero.appearance.getColor() + ", Vestimenta - " + hero.appearance.getoutfit() + ", Pelo - " + hero.appearance.getHairstyle());
    }
}