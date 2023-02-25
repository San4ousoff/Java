package org.example.Seminar4.hw;

import org.example.Lib;

import static org.example.CheckStr.isValid;

public class hw2 {
    public static void main(final String[] args) throws Exception {
        String str = Lib.receiveStr();
        System.out.println(isValid(str));
    }
}

/*
Код метода isValid для проверки по ссылке https://leetcode.com/problems/valid-parentheses/submissions/904639026/
 */
