package org.example.SeminarOOP4.hw;

public interface VendingMachine {
    Product getProduct(String name) throws IllegalStateException;
}
