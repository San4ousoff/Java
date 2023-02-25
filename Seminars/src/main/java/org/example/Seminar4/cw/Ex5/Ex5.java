package org.example.Seminar4.cw.Ex5;

import java.util.Arrays;
import java.util.LinkedList;

public class Ex5 {
    public static void main(String[] args) {
        LinkedList<Integer> ourList = new LinkedList<>(Arrays.asList(-1, -2, -3, 4, 5, -6, -7, 8, -9));

//        for (int i = ourList.size()-1; i >= 0 ; i--) {
//            if(ourList.get(i) < 0) ourList.remove(i);
//
//        }

        for (int i = 0; i < ourList.size(); i++) {
            if (ourList.get(i) < 0) {
                ourList.remove(i);
                i--;
            }
            System.out.println(ourList);
        }
        System.out.println(ourList);
    }

}
