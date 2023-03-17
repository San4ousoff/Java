package org.example.SeminarOOP5.hw.view;

import org.example.SeminarOOP5.hw.model.Cat;
import org.example.SeminarOOP5.hw.model.Dog;
import org.example.SeminarOOP5.hw.service.AgeEqualsWeightService;
import org.example.SeminarOOP5.hw.service.AgeEqualsWeightServiceImpl;

/**
 * Класс, реализующий визуализацию
 */
public class IView {
    private AgeEqualsWeightService ageEqualsWeightService = new AgeEqualsWeightServiceImpl();

    /**
     * Метод показывающий булевый результат работы метода ageVsWeight(cat, dog)
     * @param cat объект класса Cat
     * @param dog объект класса Dog
     */
    public void statusPrint(Cat cat, Dog dog) {
        System.out.println(ageEqualsWeightService.ageVsWeight(cat, dog));
    }

    /**
     * Метод отображающий в консоли результат работы
     * @param cat объект класса Cat
     * @param dog объект класса Dog
     */
    public void resultPrint(Cat cat, Dog dog) {
        if (ageEqualsWeightService.ageVsWeight(cat, dog) == true) {
            String str = String.format("Кот %s живёт столько же, сколько пёс %s жрёт!", cat.getName(), dog.getName());
            System.out.println(str);
        }
    }
}
