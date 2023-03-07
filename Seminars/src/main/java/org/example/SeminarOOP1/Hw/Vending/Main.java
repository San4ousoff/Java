package org.example.SeminarOOP1.Hw.Vending;

import org.example.SeminarOOP1.Hw.Vending.machine.VMHotDrinksImplVM;
import org.example.SeminarOOP1.Hw.Vending.product.HotDrinks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VMHotDrinksImplVM vmHotDrinks  = new VMHotDrinksImplVM();
        List<HotDrinks> hotDrinksList = new ArrayList<>(Arrays.asList(
                new HotDrinks("Cappuccino", 150, 80),
                new HotDrinks("Latte", 180, 70),
                new HotDrinks("Latte", 200, 90),
                new HotDrinks("Hot water", 30, 100)));
        vmHotDrinks.loadingProducts(hotDrinksList);
        System.out.println("Search by name: " + vmHotDrinks.getProduct("Latte"));
        System.out.println("Search by temperature < " + vmHotDrinks.getProduct(85));
    }
}
