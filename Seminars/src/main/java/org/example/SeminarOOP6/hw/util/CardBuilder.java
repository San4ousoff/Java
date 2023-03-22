package org.example.SeminarOOP6.hw.util;

import org.example.SeminarOOP6.hw.model.Card;

public class CardBuilder {
    private static CardBuilder instance = null;
    Card obj;

    public CardBuilder(){};

    public static CardBuilder getInstance() {
        if (instance == null)
            instance = new CardBuilder();
        instance.obj = new Card ();
        return instance;
    }

    public CardBuilder setIdCard(short idCard) {
        obj.setIdCard(idCard);
        return this;
    }

    public CardBuilder setNameCard(String nameCard) {
        obj.setNameCard(nameCard);
        return this;
    }

    public Card build() {
        return obj;
    }
}
