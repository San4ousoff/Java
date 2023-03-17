package org.example.SeminarOOP5.cw.bank.service;

import org.example.SeminarOOP5.cw.bank.model.User;

import java.io.FileWriter;

public class UserServiceImpl implements UserService {
    @Override
    public void save(User user) {
//        Company com = new User();
//        Human hum = new User();
        try (FileWriter fileWriter = new FileWriter("users.txt")) {
            fileWriter.write(user.toString());
        } catch (Exception e) {
            System.out.println("error during saving a user");
            e.printStackTrace();
        }
    }

    @Override
    public boolean credit(User user, int creditSum) {
        if (user.isHaveCredit() == true || creditSum * 2 >= user.getBalance()) return false;
        else return true;
    }



}
