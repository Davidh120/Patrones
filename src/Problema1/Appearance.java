package com.example.demo.Problema1;

public class Appearance {
    private String color;
    private String outfir;
    private String hairstyle;

    public Appearance(String color, String outfir, String hairstyle) {
        this.color = color;
        this.outfir = outfir;
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

    protected Appearance clone() {
        return new Appearance(this.color, this.outfir, this.hairstyle);
    }

}