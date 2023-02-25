package org.example.Seminar5.hw;

import org.example.CheckStr;
import org.example.Lib;

import java.util.HashMap;
import java.util.Map;

public class hw1 {
    public static void main(String[] args) {
        String text = Lib.receiveStr();
        String [] words = CheckStr.strAlphaLower(text).split(" ");

        Map<String, Integer> mapWord = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            mapWord.putIfAbsent(words[i],0);
            mapWord.put(words[i],mapWord.get(words[i])+1);
        }
        for (var entry:mapWord.entrySet()) {
            System.out.printf("Слово '%s' встретилось %d раз(а)\n", entry.getKey(), entry.getValue());
        }
    }
}
