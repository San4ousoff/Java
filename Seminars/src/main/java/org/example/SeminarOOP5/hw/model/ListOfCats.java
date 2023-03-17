package org.example.SeminarOOP5.hw.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Iterator;
import java.util.List;

@Getter
@Setter

/**
 * Класс ListOfCats создающий список (приют) котов с помощью итератора
 */
public class ListOfCats implements Iterable<Cat> {
    List<Cat> catList;

    @Override
    public Iterator<Cat> iterator() {
        return catList.iterator();
    }
}
