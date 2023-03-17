package org.example.SeminarOOP5.hw.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
/**
 * Класс Dog расширяет класс Animal дополнительными полями, доступными для псов
 */
public class Dog extends Animal {
    private int weight;
    private String color;

    public Dog(String name, int weight, String color) {
        super(name);
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() { return String.format("Кличка пса: %s, Вес: %d, Окрас: %s", super.getName(), weight, color); }
}
