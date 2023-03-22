package org.example.SeminarOOP6.hw.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

/**
 * Класс Card, содержащий поля характеризующие банковскую карту
 */
public class Card {
    private short idCard;
    private String nameCard;

    @Override
    public String toString() {
        return String.format("Карта %s", nameCard);
    }
}
