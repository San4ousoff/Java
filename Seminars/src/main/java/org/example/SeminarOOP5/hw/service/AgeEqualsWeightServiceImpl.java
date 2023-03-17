package org.example.SeminarOOP5.hw.service;

import org.example.SeminarOOP5.hw.model.Cat;
import org.example.SeminarOOP5.hw.model.Dog;

/**
 * Класс реализации интерфейса AgeEqualsWeightService
 */
public class AgeEqualsWeightServiceImpl implements AgeEqualsWeightService {
    /**
     * Метод возвращающий true, если возраст кота и вес пса совпадают
     * @param cat объект класса Cat
     * @param dog объект класса Dog
     * @return
     */
    @Override
    public boolean ageVsWeight(Cat cat, Dog dog) {
        return cat.getAge() == dog.getWeight();
    }
}
