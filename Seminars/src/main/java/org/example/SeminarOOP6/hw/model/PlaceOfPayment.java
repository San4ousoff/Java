package org.example.SeminarOOP6.hw.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PlaceOfPayment extends Cashback {
    private short idPlaceOfPayment;
    private String namePlaceOfPayment;

    @Override
    public String toString() {
        return String.format("Место оплаты %s", namePlaceOfPayment);
    }
}
