package org.example.SeminarOOP5.hw.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
/**
 * Класс Cat расширяет класс Animal дополнительными полями, доступными для котов
 */
public class Cat extends Animal {
    private int age;

    public Cat(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public String toString() { return String.format("Кличка кота: %s, Возраст: %d", super.getName(), age); }
}
