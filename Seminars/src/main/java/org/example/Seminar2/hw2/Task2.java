package org.example.Seminar2.hw2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N: ");
        int n = scanner.nextInt();
        int num1 = scanner.nextInt();
        boolean flag = true;
        for (int i = 1; i < n; i++) {
            int num2 = scanner.nextInt();
            if (num2 < num1) {
                flag = false;
                break;
            } else {
                num1 = num2;
            }
        }
        scanner.close();
        if (flag == false) {
            System.out.println("Not increasing");
        } else {
            System.out.println("Increasing");
        }
    }
}
