package org.example.Seminar1.cw;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();

        StringBuilder myNewStr = new StringBuilder();
        myNewStr.append(str.substring(str.length() / 2, str.length()))
                .append(str.substring(0, str.length() / 2));
        System.out.println(myNewStr.toString());
    }
}
