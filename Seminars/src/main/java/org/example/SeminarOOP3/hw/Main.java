package org.example.SeminarOOP3.hw;

import org.example.SeminarOOP3.hw.ListOfCatComparators.ListOfCatByName;
import org.example.SeminarOOP3.hw.ListOfCatComparators.ListOfCatsByAge;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ListOfCats cats = new ListOfCats();
        cats.setCatList(Arrays.asList(
                new Cat("Черныш", 1),
                new Cat("Барсик", 1),
                new Cat("Рыжик", 3),
                new Cat("Мурзик", 5)));

        Iterator<Cat> iterator = cats.iterator();
        System.out.println("Listing cats by using Iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("List of cats by age and name by using Comparable:");
        Collections.sort(cats.getCatList());
        for (Cat cat: cats){
            System.out.println(cat);
        }

        System.out.println("List of cats by age by using Comparator:");
        cats.getCatList().sort(new ListOfCatsByAge());
        for (Cat cat: cats){
            System.out.println(cat);
        }

        System.out.println("List of cats by name by using Comparator:");
        cats.getCatList().sort(new ListOfCatByName());
        for (Cat cat: cats){
            System.out.println(cat);
        }
    }
}
