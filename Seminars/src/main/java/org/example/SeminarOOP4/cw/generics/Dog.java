package org.example.SeminarOOP4.cw.generics;

public class Dog extends Animal {

    private int weight;
    private String color;

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public Dog(String name, int weight, String color) {
        super(name);
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Песель %s, весом %d, с окрасом %s", super.getName(), weight, color);
    }
}
