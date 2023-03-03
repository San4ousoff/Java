package org.example.Seminar6.hw.Nb;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Model notebook1 = new Model(1, "Lenovo", 8, "HDD", 500, 50000);
        Model notebook2 = new Model(2, "HP", 16, "HDD", 1500, 60000);
        Model notebook3 = new Model(3, "Lenovo", 32, "SSD", 1000, 80000);
        Model notebook4 = new Model(4, "IBM", 8, "SSD", 500, 70000);
        Model notebook5 = new Model(5, "LG", 16, "HDD", 1000, 40000);
        Set<Model> set = new HashSet<>();
        set.add(notebook1);
        set.add(notebook2);
        set.add(notebook3);
        set.add(notebook4);
        set.add(notebook5);
        System.out.println(set);







    }
}