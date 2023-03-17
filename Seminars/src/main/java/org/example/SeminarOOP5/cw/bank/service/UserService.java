package org.example.SeminarOOP5.cw.bank.service;

import org.example.SeminarOOP5.cw.bank.model.User;

public interface UserService {
     void save(User user);
     boolean credit(User user, int creditSum);
}
