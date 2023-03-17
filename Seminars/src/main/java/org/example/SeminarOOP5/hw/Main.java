package org.example.SeminarOOP5.hw;

import org.example.SeminarOOP5.hw.model.Cat;
import org.example.SeminarOOP5.hw.model.Dog;
import org.example.SeminarOOP5.hw.model.ListOfCats;
import org.example.SeminarOOP5.hw.model.ListOfDogs;
import org.example.SeminarOOP5.hw.view.IView;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ListOfDogs listOfDogs = new ListOfDogs();
        listOfDogs.setDogList(Arrays.asList(
                new Dog("Бобик", 20, "Черный"),
                new Dog("Шарик", 15, "Белый"),
                new Dog("Полкан", 7, "Красный")));
        ListOfCats listOfCats = new ListOfCats();
        listOfCats.setCatList(Arrays.asList(
                new Cat("Мурзик", 25),
                new Cat("Тимофей", 15),
                new Cat("Рыжик", 20)));

        IView iView = new IView();
        for (Cat cat : listOfCats) {
            for (Dog dog : listOfDogs) {
                iView.resultPrint(cat, dog);
            }
        }
    }
}
