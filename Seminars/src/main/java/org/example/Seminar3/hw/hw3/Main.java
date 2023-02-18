package org.example.Seminar3.hw.hw3;

import org.example.CheckNum;
import org.example.Seminar3.hw.hw3.model.Books;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Books books1 = new Books("Сказки", "Пашкин", 100, 2020, 7);
        Books books2 = new Books("Романы", "Толстой", 500, 2001, 2500);
        Books books3 = new Books("Повести", "Островский", 200, 2010, 1000);
        Books books4 = new Books("Стихи", "Маршак", 200, 2020, 211);
        Books books5 = new Books("Биография", "Белинский", 300, 2020, 500);
        List<Books> booksList = new ArrayList<>();
        booksList.add(books1);
        booksList.add(books2);
        booksList.add(books3);
        booksList.add(books4);
        booksList.add(books5);
        List<String> titleList = new ArrayList<>();
        for (int i = 0; i < booksList.size(); i++) {
            if ((CheckNum.primeB(booksList.get(i).getPages())) &&
                    (booksList.get(i).getSurname().contains("А") || booksList.get(i).getSurname().contains("а")) &&
                    (booksList.get(i).getYear() > 2009)) {
                titleList.add(booksList.get(i).getTitle());
            }
        }
        String str = String.join(", ", titleList);
        System.out.printf("Title books: %s", str);
    }
}
