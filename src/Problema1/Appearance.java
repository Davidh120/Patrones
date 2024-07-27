package com.example.demo.Problema1;

public class Appearance {
    private String color;
    private String outfit;
    private String hairstyle;

    public Appearance(String color, String outfit, String hairstyle) {
        this.color = color;
        this.outfit = outfit;
        this.hairstyle = hairstyle;
    }

    public String getColor() {
        return this.color;
    }

    public String getoutfit() {
        return this.outfit;
    }

    public String getHairstyle() {
        return this.hairstyle;
    }

    public void setColor(String color) {
        this.color = color;
    }

    protected Appearance clone() {
        return new Appearance(this.color, this.outfit, this.hairstyle);
    }

}