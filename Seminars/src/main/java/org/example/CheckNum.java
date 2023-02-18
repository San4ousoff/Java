package org.example;

/**
 * Класс, содержащий методы для проверки числа по различным условиям
 *
 * @author Kiriakov Aleksander
 */
public class CheckNum {
    private int num;

    public CheckNum() {
    }

    public CheckNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "PrimeNum{" +
                "num=" + num +
                '}';
    }

    /**
     * @param num проверяемое число
     * @return простое число либо 0
     */
    public int prime(int num) {
        if (num < 2) {
            return 0;
        }
        double sqNum = Math.sqrt(num);
        for (int i = 2; i <= sqNum; i++) {
            if (num % i == 0) {
                return 0;
            }
        }
        return num;
    }

    public static boolean primeB(int num) {
        if (num < 2) {
            return false;
        }
        double sqNum = Math.sqrt(num);
        for (int i = 2; i <= sqNum; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}