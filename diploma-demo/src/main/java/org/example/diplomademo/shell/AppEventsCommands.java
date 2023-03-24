package org.example.diplomademo.shell;

import org.example.diplomademo.services.CardService;
import org.h2.tools.Console;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import java.sql.SQLException;

@ShellComponent
public class AppEventsCommands {
    private final CardService cardService;
//    private final SalePointService salePointService;
//    private final CashbackService cashbackService;

    @Autowired
    public AppEventsCommands(CardService cardService) { this.cardService = cardService; }

//    @Autowired
//    public AppEventsCommands(SalePointService salePointService) { this.salePointService = salePointService; }
//
//    @Autowired
//    public AppEventsCommands(CashbackService cashbackService) {
//        this.cashbackService = cashbackService;
//    }

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


}
