/*
Методы для возможного частого применения
*/

package org.example;

import java.util.Scanner;

public class Lib {
    /* метод определения типа переменной */
    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }

    /* метод ввода строки и передачи ее для обработки */
    public static String receiveStr() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите исходную строку через пробелы: ");
        String str = iScanner.nextLine();
//        System.out.println(Lib.getType(s));
        iScanner.close();
        return str;
    }

    /* метод создания массива из случайных чисел (без 0) с 0 на конце и передачи его для обработки */
    public static int[] receiveRandArrayWithEndNull() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int num = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            do {
                array[i] = ((int) (Math.random() * 18) - 9);
                if (i == array.length - 1) {
                    array[i] = 0;
                    break;
                }
            } while (array[i] == 0);
//        System.out.printf("%s ", array[i]);
        }
        return array;
    }
}
