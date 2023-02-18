//package org.example.Seminar3.cw.Ex3;
//
//public class Ex3 {
//    public static void main(String[] args) {
//        Items items = new Items(3, "желтый", "деревянный");
//        Items items2 = new Items(3, "зеленый", "металлический");
//        Items items3 = new Items(4, "красный", "картонный");
//        Items items4 = new Items(2, "желтый", "стальной");
//
//        List<Items> itemsList = new ArrayList<>();
//        itemsList.add(items);
//        itemsList.add(items2);
//        itemsList.add(items3);
//        itemsList.add(items4);
//        System.out.println(itemsList);
//
//        Integer k = 0;
//        Integer volume = 0;
//        Integer kWood = 0;
//        for (int i = 0; i < itemsList.size(); i++) {
//            Items cube = itemsList.get(i);
//            if (cube.getColor().equals("желтый")) {
//                k++;
//                volume += volumeCube(itemsList.get(i).getSize());
//            }
//            if ((cube.getMaterial().equals("деревянный") && (cube.getSize() == 3))) {
//                kWood++;
//            }
//        }
//        System.out.println("1 пункт: " + k + " объем " + volu
//
//    }
