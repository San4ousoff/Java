package org.example.SeminarOOP6.cw.Animal;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat = CatBuilder.getInstance().setName("Barsik").build();
        System.out.println(cat);
    }
}
