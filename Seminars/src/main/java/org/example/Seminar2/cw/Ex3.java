package org.example.Seminar2.cw;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int k = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mass = new int[n];
        for (int i = 0; i < n; i++) {
            mass[i] = scanner.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            if (mass[i] == 2 * mass[i + 1]) {
                k++;
            }
        }
        scanner.close();
        System.out.println("k= " + k);
    }

}
