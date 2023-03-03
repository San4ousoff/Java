package org.example.Seminar6.hw.Nb;

import java.lang.reflect.Field;
import java.util.*;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);

        Model notebook1 = new Model(1, "Lenovo", 8, 500, 50000);
        Model notebook2 = new Model(2, "HP", 16, 1500, 60000);
        Model notebook3 = new Model(3, "Lenovo", 32, 1000, 80000);
        Model notebook4 = new Model(4, "IBM", 8, 500, 70000);
        Model notebook5 = new Model(5, "LG", 16, 1000, 40000);
        Set<Model> setNotebooks = new HashSet<>();
        setNotebooks.add(notebook1);
        setNotebooks.add(notebook2);
        setNotebooks.add(notebook3);
        setNotebooks.add(notebook4);
        setNotebooks.add(notebook5);

        Class c = Class.forName("org.example.Seminar6.hw.Nb.Model");
        Field[] fs = c.getDeclaredFields();
        Map<Integer, String> modelMap = new HashMap<>();
        for (int i = 1; i < fs.length; i++) {
            modelMap.put(i, fs[i].getName());
        }
        System.out.println(modelMap);

        System.out.println("Select criteria: ");
        int value = scanner.nextInt();

        SortedSet<String> setFabricator = new TreeSet<>();
        for (Model nb : setNotebooks) {
            setFabricator.add(nb.getFabricator());
        }

        SortedSet<Integer> setRam = new TreeSet<>();
        for (Model nb : setNotebooks) {
            setRam.add(nb.getRam());
        }

        SortedSet<Integer> setHd = new TreeSet<>();
        for (Model nb : setNotebooks) {
            setHd.add(nb.getHd());
        }

        SortedSet<Integer> setPrice = new TreeSet<>();
        for (Model nb : setNotebooks) {
            setPrice.add(nb.getPrice());
        }

        if (value == 1) System.out.println(setFabricator);
        if (value == 2) System.out.println(setRam);
        if (value == 3) System.out.println(setHd);
        if (value == 4) System.out.println(setPrice);

        System.out.println("Input value: ");
        String parameter = scanner.next();

        for (Model nb : setNotebooks) {
            if (value  == 1) {
                if (nb.getFabricator().contains(parameter)) System.out.println(nb);
            }
            if (value  == 2) {
                if (nb.getRam().equals(parseInt(parameter))) System.out.println(nb);
            }
            if (value  == 3) {
                if (nb.getHd().equals(parseInt(parameter))) System.out.println(nb);
            }
            if (value  == 4) {
                if (nb.getPrice().equals(parseInt(parameter))) System.out.println(nb);
            }
        }
    }
}