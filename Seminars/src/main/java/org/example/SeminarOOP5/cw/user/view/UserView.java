package org.example.SeminarOOP5.cw.user.view;

import org.example.SeminarOOP5.cw.user.model.User;
import org.example.SeminarOOP5.cw.user.service.UserService;
import org.example.SeminarOOP5.cw.user.service.UserServiceImpl;

public class UserView {
    private UserService userService = new UserServiceImpl();
    public void saveUser(String name, int age , float salary){
        userService.save(new User(name, age, salary));
    }
}
