package org.example.SeminarOOP3.hw;

public class Cat implements Comparable<Cat>{
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Кличка: " + name + ',' + " Возраст: " + age;
    }

    /**
     * Переопределенный метод сортировки по полю Возраст, если возраст равен - по Кличке
     * @param cat the object to be compared.
     * @return -1 и 1 в зависимости от состояния сравниваемых полей
     */
    @Override
    public int compareTo(Cat cat) {
        if (age == cat.getAge()) {
            return name.compareTo(cat.getName());
        }
        if (age < cat.getAge()) {
            return -1;
        }
        return 1;
    }

    /**
     * Переопределенный метод сортировки по кличке
     */
//    @Override
//    public int compareTo(Cat cat) {
//        return name.compareTo(cat.getName());
//    }
}