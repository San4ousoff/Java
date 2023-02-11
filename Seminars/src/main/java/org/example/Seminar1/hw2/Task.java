/*
Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует
отрицательное число.

Пример: 1 2 1 2 -1 1 3 1 3 -1 0
2 -1 переход - 2 в сумму
3 -1 переход 3 в сумму
суммарно выведет 5

Алгоритм:
1. Сформировать последовательность чисел +
2. Создать переменную-накопитель под сумму
3. В цикле брать число на проверку:
    - положительное
    - следующее число отрицательное
    - если да - добавлять в накопитель
*/
package org.example.Seminar1.hw2;

import static org.example.Lib.receiveRandArrayWithEndNull;

public class Task {
    public static void main(String[] args) {
        int[] myArray = receiveRandArrayWithEndNull();
//        int[] myArray = {5, 6, 3, 6, -7, -5, -4, 7, -2, 0}; // - для экспериментов
        int summa = 0;
        System.out.print("Исходная последовательность чисел: ");
        for (int i = 0; i < myArray.length; i++)
            System.out.print(myArray[i] + " ");
        for (int i = 0; i < myArray.length - 2; i++) {
            if (myArray[i] > 0 & myArray[i + 1] < 0) {
                summa += myArray[i];
            }
        }
        System.out.printf("\nСумма положительных чисел, после которых следует отрицательное число: %s", summa);
    }
}
