package org.example.SeminarOOP1.Hw.Vending.machine;

import org.example.SeminarOOP1.Hw.Vending.product.HotDrinks;

import java.util.ArrayList;
import java.util.List;

public class VMHotDrinksImplVM implements VendingMachine {
    List<HotDrinks> hotDrinksList = new ArrayList<>();
    List<HotDrinks> outputResult = new ArrayList<>();

    @Override
    public void loadingProducts() {}

    public void loadingProducts(List<HotDrinks> list) {this.hotDrinksList = list;}

    @Override
    public String getProduct() {return null;}

    public String getProduct(String name) {
        outputResult.clear();
        for (HotDrinks unit : hotDrinksList) {
            if (unit.getName() == name) outputResult.add(unit);
        }
        return outputResult.toString();
    }

    public String getProduct(int temperature) {
        outputResult.clear();
        for (HotDrinks unit : hotDrinksList) {
            if (unit.getTemperature() < temperature) outputResult.add(unit);
        }
        return outputResult.toString();
    }
}
