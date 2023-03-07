package org.example.SeminarOOP1.Hw.Vending.machine;

public interface VendingMachine {
    /**
     * Загрузка продуктов в автомат
     */
    void loadingProducts();

    /**
     * Получение продуктов из автомата
     * @return String
     */
    String getProduct();
}
