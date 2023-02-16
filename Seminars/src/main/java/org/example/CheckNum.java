package org.example.Seminar2.hw1;

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
        if (num % 2 != 0 || num % 5 != 0) {
            for (int i = 3; i < num; i = i + 2) {
                if (num % i == 0) {
                    return 0;
                }
            }
        }
        return num;
    }
}