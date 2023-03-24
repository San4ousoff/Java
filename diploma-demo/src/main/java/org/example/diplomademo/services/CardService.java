package org.example.diplomademo.services;

import org.example.diplomademo.entities.Card;

import java.util.List;
import java.util.Optional;

public interface CardService {
    List<Card> getAllCard();
    Card createCard(Card card);
    void updateCard(Card card);
    void deleteCard(Card card);
    Optional<Card> getNameById(long id);
}
