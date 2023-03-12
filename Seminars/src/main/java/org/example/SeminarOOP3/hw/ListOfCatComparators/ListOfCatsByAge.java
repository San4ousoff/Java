package org.example.SeminarOOP3.hw.ListOfCatComparators;

import org.example.SeminarOOP3.hw.Cat;

import java.util.Comparator;

/**
 * Класс для реализации сортировки по Возрасту с использованием Comparator
 */
public class ListOfCatsByAge implements Comparator<Cat> {
    public ListOfCatsByAge() {
    }

    @Override
    public int compare(Cat cat1, Cat cat2) {
        if(cat1.getAge() == cat2.getAge()){
            return 0;
        }
        if(cat1.getAge() < cat2.getAge()){
            return -1;
        }
        return 1;
    }
}


