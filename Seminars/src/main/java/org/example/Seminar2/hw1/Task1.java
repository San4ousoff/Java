package org.example.Seminar2.hw1;

import org.example.CheckNum;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N: ");
        int n = scanner.nextInt();
        int primeSum = 0;
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            CheckNum checkNum = new CheckNum(number);
            primeSum += checkNum.prime(number);
        }
        scanner.close();
        System.out.printf("Summa = %s", primeSum);
    }
}
