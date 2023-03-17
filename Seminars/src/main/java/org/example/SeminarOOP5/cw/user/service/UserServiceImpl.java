package org.example.SeminarOOP5.cw.user.service;

import org.example.SeminarOOP5.cw.user.model.User;

import java.io.FileWriter;

public class UserServiceImpl implements UserService {
    @Override
    public void save(User user) {
        try(FileWriter fileWriter = new FileWriter("users.txt")){
            fileWriter.write(user.toString());
        }catch (Exception e){
            System.out.println("error during saving a user");
            e.printStackTrace();
        }
        //if credit == true -> нащКредит.сумма > balance -> false
    }
}
