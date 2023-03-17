package org.example.SeminarOOP5.cw.user;

import org.example.SeminarOOP5.cw.user.view.UserView;

import java.util.Scanner;
//Классы различных пользователей 2-3
// Класс в сервисе, рассматривающий заявки на кредитование

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name");
        String name = scanner.nextLine();
        System.out.println("enter age");
        int age = scanner.nextInt();
        System.out.println("enter salary");
        float salary = scanner.nextInt();
        UserView userView = new UserView();
        userView.saveUser(name,age,salary);
    }
}
