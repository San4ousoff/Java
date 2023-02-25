package org.example;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lib {
    /**
     * @param o переменная, чей тип определяется
     * @return тип переменной
     */
    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }

    /**
     * @return введенную пользователем строку
     */
    public static String receiveStr() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("String: ");
        String str = iScanner.nextLine();
        return str;
    }

    /**
     * @return введенную пользователем строку
     */
    public static String receiveWord() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("What word to find (lowercase): ");
        String str = iScanner.nextLine();
        return str;
    }

    /**
     * @return массив из случайных чисел (кроме 0). Последний элемент массива - 0
     */
    public static int[] receiveRandArrayWithEndNull() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int num = sc.nextInt();
        sc.close();
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            do {
                array[i] = ((int) (Math.random() * 18) - 9);
                if (i == array.length - 1) {
                    array[i] = 0;
                    break;
                }
            } while (array[i] == 0);
        }
        return array;
    }

    /**
     * @param n        количество элементов в массиве
     * @param minValue минимальное значение элемента массива
     * @param maxValue максимальное значение элемента массива
     * @return массив из случайных чисел
     */
    public static int[] receiveRandArray(int n, int minValue, int maxValue) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.ints(minValue, (maxValue + 1)).findFirst().getAsInt();
        }
        return array;
    }

    /**
     *
     * @param myArray массив
     * @return максимальный элемент массива
     */
    public static int MaxElemArray(List myArray) {
        int maxNum = (int) myArray.get(0);
        for (int i = 0; i < myArray.size(); i++) {
            if ((int) myArray.get(i) > maxNum) {
                maxNum = (int) myArray.get(i);
            }
        }
        return maxNum;
    }

    /**
     *
     * @param myArray массив
     * @return минимальный элемент массива
     */
    public static int MinElemArray(List myArray) {
        int minNum = (int) myArray.get(0);
        for (int i = 0; i < myArray.size(); i++) {
            if ((int) myArray.get(i) < minNum) {
                minNum = (int) myArray.get(i);
            }
        }
        return minNum;
    }
}

