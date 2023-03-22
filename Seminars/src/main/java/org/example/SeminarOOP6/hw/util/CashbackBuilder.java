package org.example.SeminarOOP6.hw.util;

import org.example.SeminarOOP6.hw.model.Cashback;

public class CashbackBuilder {
    private static CashbackBuilder instance = null;
    Cashback obj;

    public CashbackBuilder(){};

    public static CashbackBuilder getInstance() {
        if (instance == null)
            instance = new CashbackBuilder();
        instance.obj = new Cashback();
        return instance;
    }

    public CashbackBuilder setIdCashback(short idCashback) {
        obj.setIdCashback(idCashback);
        return this;
    }

    public CashbackBuilder setValueCashback(double valueCashback) {
        obj.setValueCashback(valueCashback);
        return this;
    }

    public Cashback build() {
        return obj;
    }
}
