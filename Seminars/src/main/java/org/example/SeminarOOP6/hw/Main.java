package org.example.SeminarOOP6.hw;

import org.example.SeminarOOP6.hw.util.CardBuilder;
import org.example.SeminarOOP6.hw.util.CashbackBuilder;
import org.example.SeminarOOP6.hw.util.PlaceOfPaymentBuilder;

public class Main {
    public static void main(String[] args) {
        var placeOfPayment1 = PlaceOfPaymentBuilder.getInstance().setIdPlaceOfPayment((short) 1).setNamePlaceOfPayment("Заправка").build();
        System.out.println(placeOfPayment1);
        var cashback1 = CashbackBuilder.getInstance().setIdCashback((short) 1).setValueCashback(0.05).build();
        System.out.println(cashback1);
        var card1 = CardBuilder.getInstance().setIdCard((short) 1).setNameCard("Зарплатная").build();
        System.out.println(card1);
    }
}
