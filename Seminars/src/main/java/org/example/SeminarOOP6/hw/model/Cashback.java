package org.example.SeminarOOP6.hw.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Cashback extends Card {
    private short idCashback;
    private double valueCashback;

    @Override
    public String toString() {
        return String.format("Размер кэшбека %f", valueCashback);
    }
}
