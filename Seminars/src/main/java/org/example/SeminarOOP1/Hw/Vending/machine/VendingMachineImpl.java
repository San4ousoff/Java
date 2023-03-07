package org.example.SeminarOOP1.Hw.Vending.machine;

import org.example.SeminarOOP1.Hw.Vending.product.Product;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineImpl implements VendingMachine {
    List<Product> productList = new ArrayList<>();

    @Override
    public void loadingProducts() {}

    public void loadingProduct(List<Product> products) {this.productList = products;}

    @Override
    public String getProduct() {return null;}

    public String getProduct(String name) {
        for (Product unit : productList) {
            if(unit.getName().equals(name)) return unit.toString();
        }
        return "Not found";
    }
}
