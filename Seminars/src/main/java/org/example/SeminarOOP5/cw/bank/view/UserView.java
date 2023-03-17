package org.example.SeminarOOP5.cw.bank.view;

import org.example.SeminarOOP5.cw.bank.model.User;
import org.example.SeminarOOP5.cw.bank.service.UserService;
import org.example.SeminarOOP5.cw.bank.service.UserServiceImpl;

public class UserView {
    private UserService userService = new UserServiceImpl();
    public void saveUser(String name, int age , float salary){
        userService.save(new User(name));
    }
    public void creditPrint(User user, int creditSum){
        System.out.println(userService.credit(user,creditSum));
    }
}
