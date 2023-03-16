package org.example.SeminarOOP4.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BottleOfWaterVendingMachine bottleOfWaterVM = new BottleOfWaterVendingMachine();
        List<BottleOfWater> bottleOfWaterList = new ArrayList<BottleOfWater>(Arrays.asList(
                new BottleOfWater("Тархун", 100, 500),
                new BottleOfWater("Байкал", 150, 750),
                new BottleOfWater("Вода", 50, 1000),
                new BottleOfWater("Буратино", 120, 500)));

        System.out.println("\nList of BottleOfWater by name by using Comparator<T>:\");");
        bottleOfWaterList.sort(new ProductComparator<>());
        for (BottleOfWater bottle: bottleOfWaterList){
            System.out.println(bottle);
        }

    }
}
