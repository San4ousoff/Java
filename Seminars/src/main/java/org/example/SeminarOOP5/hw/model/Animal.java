package org.example.SeminarOOP5.hw.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

/**
 * Абстрактный класс Animal, содержащий поле name и всё, что создает lombok
 */
public abstract class Animal {
    private  String name;
}
