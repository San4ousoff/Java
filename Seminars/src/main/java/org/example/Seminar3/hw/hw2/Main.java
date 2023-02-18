package org.example.Seminar3.hw.hw2;

import org.example.Seminar3.hw.hw2.model.Products;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Products products1 = new Products("Колбаса", "Россия", 100, 200, 1);
        Products products2 = new Products("Сыр", "Швейцария", 10, 4000, 1);
        Products products3 = new Products("Шоколад", "Бельгия", 50, 500, 2);
        Products products4 = new Products("Мясо", "Россия", 1000, 400, 2);
        Products products5 = new Products("Рыба", "Китай", 1000, 200, 1);
        List<Products> productsList = new ArrayList<>();
        productsList.add(products1);
        productsList.add(products2);
        productsList.add(products3);
        productsList.add(products4);
        productsList.add(products5);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sort = ");
        Integer searchSort = scanner.nextInt();
        scanner.close();
        List<Products> sortList = new ArrayList<>();
        List<String> nameList = new ArrayList<>();
        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).getSort().equals(searchSort)) {
                sortList.add(productsList.get(i));
            }
        }
        int minEl = sortList.get(0).getPrice();
        for (int i = 1; i < sortList.size(); i++) {
            if (sortList.get(i).getPrice() < minEl) {
                minEl = sortList.get(i).getPrice();
            }
        }
        for (int i = 0; i < sortList.size(); i++) {
            if (sortList.get(i).getPrice().equals(minEl)) {
                nameList.add(sortList.get(i).getName());
            }
        }
        String str = String.join(", ", nameList);
        System.out.printf("Name product with min price: %s", str);
    }
}
