package org.example.SeminarOOP3.hw.ListOfCatComparators;

import org.example.SeminarOOP3.hw.Cat;

import java.util.Comparator;

/**
 * Класс для реализации сортировки по кличке с использованием Comparator
 */
public class ListOfCatByName implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1, Cat cat2) {
        return cat1.getName().compareTo(cat2.getName());
    }
}
