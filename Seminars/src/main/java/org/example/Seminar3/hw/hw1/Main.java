package org.example.Seminar3.hw.hw1;

import org.example.Lib;
import org.example.Seminar3.hw.hw1.model.Products;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Products products1 = new Products("Колбаса", 1, 1);
        Products products2 = new Products("Рыб высший", 10, 2);
        Products products3 = new Products("Мяс высший", 101, 1);
        Products products4 = new Products("Мясо", 5, 2);
        Products products5 = new Products("Рыба высший", 10, 3);
        List<Products> productsList = new ArrayList<>();
        productsList.add(products1);
        productsList.add(products2);
        productsList.add(products3);
        productsList.add(products4);
        productsList.add(products5);
        String searchName = "высший";
        List<Integer> priceList = new ArrayList<>();
        for (int i = 0; i < productsList.size(); i++) {
            if ((productsList.get(i).getSort() == 1 || productsList.get(i).getSort() == 2) && (productsList.get(i).getName().contains(searchName))) {
                priceList.add(productsList.get(i).getPrice());
            }
        }
        System.out.printf("Max price = %s", Lib.MaxElemArray(priceList));
    }
}
