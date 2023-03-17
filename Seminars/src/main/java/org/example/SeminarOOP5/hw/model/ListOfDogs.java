package org.example.SeminarOOP5.hw.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Iterator;
import java.util.List;

@Getter
@Setter
/**
 * Класс ListOfDogs создающий список (приют) псов с помощью итератора
 */
public class ListOfDogs implements Iterable<Dog>{
    List<Dog> dogList;

    @Override
    public Iterator<Dog> iterator() { return (dogList.iterator()); }
}
