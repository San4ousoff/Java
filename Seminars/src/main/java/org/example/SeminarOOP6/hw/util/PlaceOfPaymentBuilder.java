package org.example.SeminarOOP6.hw.util;

import org.example.SeminarOOP6.hw.model.PlaceOfPayment;

public class PlaceOfPaymentBuilder {
    private static PlaceOfPaymentBuilder instance = null;
    PlaceOfPayment obj;

    public PlaceOfPaymentBuilder(){};

    public static PlaceOfPaymentBuilder getInstance() {
        if (instance == null)
            instance = new PlaceOfPaymentBuilder();
        instance.obj = new PlaceOfPayment();
        return instance;
    }

    public PlaceOfPaymentBuilder setIdPlaceOfPayment(short idPlaceOfPayment) {
        obj.setIdPlaceOfPayment(idPlaceOfPayment);
        return this;
    }

    public PlaceOfPaymentBuilder setNamePlaceOfPayment(String namePlaceOfPayment) {
        obj.setNamePlaceOfPayment(namePlaceOfPayment);
        return this;
    }

    public PlaceOfPayment build() {
        return obj;
    }
}
