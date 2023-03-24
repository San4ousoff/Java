package org.example.diplomademo.controllers;

import org.example.diplomademo.entities.Card;
import org.example.diplomademo.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CardController {
    private final CardService cardService;

    @Autowired
    public CardController(CardService cardService) { this.cardService = cardService; }

    @GetMapping("/card")
    public String booksPage(Model model) {
        List<Card> cardList = cardService.getAllCard();
        model.addAttribute("card", cardList);
        return "card";
    }

}
