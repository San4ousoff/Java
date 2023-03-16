package org.example.SeminarOOP4.cw.generics;

public class Cat extends Animal {

    private int age;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + super.getName() + '\'' +
                ", age=" + age +
                '}';
    }

    public Cat(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
