package org.example.Seminar5.cw.Ex2;

import java.util.HashMap;
import java.util.Map;

public class Ex2 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,2};
        System.out.println(isDouble(arr));
    }

    /**
     *
     * @param array массив для проверки
     * @return  true, если нет дубликтов,
     *          false при наличии дубликатов
     */
    public static boolean isDouble (int [] array){
        Map<Integer, Integer> mapList = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (mapList.containsKey(array[i])) return false;
            else mapList.put(array[i], 1);
        }
        return true;
    }
}
