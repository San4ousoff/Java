package org.example.diplomademo.shell;

import org.example.diplomademo.services.CardService;
import org.h2.tools.Console;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.sql.SQLException;

@ShellComponent
public class AppEventsCommands {
    private final CardService cardService;
    @Autowired
    public AppEventsCommands(CardService cardService) { this.cardService = cardService; }

    /**
     * Метод startConsoleH2 запускает консоль
     */
    @ShellMethod(value = "Start console H2", key = {"c", "console"})
    public void startConsoleH2() {
        try {
            Console.main();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @ShellMethod(value = "Get All Cards", key = {"gac", "getallcard"})
    public void getAllCard() {
        System.out.println(cardService.getAllCard().toString());
    }

    @ShellMethod(value = "Get Card By id", key = {"gci", "getcardbyid"})
    public void getCardById(@ShellOption(defaultValue = "1") long id) {
        System.out.println(cardService.getNameById(id).get());
    }
}
