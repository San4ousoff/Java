package org.example.SeminarOOP1.Hw.Vending.product;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

@Data
@AllArgsConstructor

public abstract class Product {
    private String name;
    private Integer price;

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", price=" + price;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}

