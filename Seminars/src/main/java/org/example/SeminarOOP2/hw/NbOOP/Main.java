package org.example.SeminarOOP2.hw.NbOOP;

import org.example.SeminarOOP2.hw.NbOOP.service.LaptopService;
import org.example.SeminarOOP2.hw.NbOOP.service.LaptopServiceImpl;
import org.example.SeminarOOP2.hw.NbOOP.shell.AppEventsCommands;
import org.example.SeminarOOP2.hw.NbOOP.shell.AppEventsCommandsImpl;

public class Main {
    public static void main(String[] args) {

        LaptopService laptopService = new LaptopServiceImpl();
        laptopService.initDb();

        AppEventsCommands appEventsCommands = new AppEventsCommandsImpl(laptopService);
        appEventsCommands.startDialog();
    }
}
