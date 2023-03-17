package org.example.SeminarOOP5.hw.util;

import org.example.SeminarOOP5.hw.model.Animal;

import java.util.Comparator;

/**
 * Класс сортировки по имени
 */
public class CompareByName<T extends Animal> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
