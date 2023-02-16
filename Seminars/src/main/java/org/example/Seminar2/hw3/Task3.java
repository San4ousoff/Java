package org.example.Seminar2.hw3;

import java.util.Arrays;

import static org.example.Lib.receiveRandArray;

public class Task3 {
    public static void main(String[] args) {
        int array[] = receiveRandArray(10, -15, 15);
        System.out.printf("Array: %s", Arrays.toString(array));
        int sum_index = 0;
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if ((9 < array[i] && array[i] < 100) || (-100 < array[i] && array[i] < -9)) {
                sum_index += i;
                flag = true;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if ((array[i] < 0) && (flag == true)) {
                array[i] = sum_index;
            }
        }
        System.out.printf("\nNew Array: %s", Arrays.toString(array));
    }
}
