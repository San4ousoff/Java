package org.example.diplomademo.services;

import org.example.diplomademo.entities.Card;
import org.example.diplomademo.repositories.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CardServiceImpl implements CardService {
    private final CardRepository cardRepository;
    @Autowired
    public CardServiceImpl(CardRepository cardRepository){ this.cardRepository = cardRepository; }

    @Transactional(readOnly = true)
    @Override
    public List<Card> getAllCard() { return cardRepository.findAll(); }

    @Transactional
    @Override
    public Card createCard(Card card) { return cardRepository.save(card); }

    @Transactional
    @Override
    public void updateCard(Card card) { cardRepository.save(card); }

    @Transactional
    @Override
    public void deleteCard(Card card) { cardRepository.delete(card); }

    @Transactional(readOnly = true)
    @Override
    public Optional<Card> getNameById(long id) { return cardRepository.findById(id); }
}
