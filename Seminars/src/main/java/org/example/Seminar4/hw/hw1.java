package org.example.Seminar4.hw;

import java.util.Arrays;
import java.util.LinkedList;

public class hw1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.print("List: " + ll);
        LinkedList<Integer> revLL = new LinkedList<>();
        for (int i = ll.size() - 1; i >= 0; i--) {
            revLL.add(ll.get(i));
        }
        System.out.print("\nList after reversing: " + revLL);
    }
}
