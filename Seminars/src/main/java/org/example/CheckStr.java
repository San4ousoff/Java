package org.example;

import java.util.Stack;

public class CheckStr {

    /**
     * @param text проверяемая строка
     * @return 1. false, если открывающиеся и закрывающиеся скобки не соответствуют условиям
     * 2. true, есть каждой открывающейся скобке, есть соответствующая закрывающая
     */
    public static boolean isValid(String text) {
        Stack<Character> stack = new Stack<>();

        for (char c : text.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            if (c == ')' || c == '}' || c == ']') {
                if (!stack.isEmpty()) {
                    char fromStack = stack.peek();
                    if ((c == ')' && fromStack == '(') ||
                            (c == '}' && fromStack == '{') ||
                            (c == ']' && fromStack == '[')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    stack.add(c);
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * @param text строка для модификации
     * @return строку, состоящую только из слов и пробелов в нижнем регистре
     */
    public static String strAlphaLower(String text) {
        String alphaText = "";
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i)) || text.charAt(i)==' ') {
                alphaText = alphaText + text.charAt(i);
            }
        }
        return alphaText.toLowerCase();
    }

//    public static String[] strAlphaLowerF(String text) {
//        text = text.trim();
//        String delims = "//W+"; // не разобрался до конца, потом
//        String[] tokens = text.split(delims);
//        return tokens;
//    }

}