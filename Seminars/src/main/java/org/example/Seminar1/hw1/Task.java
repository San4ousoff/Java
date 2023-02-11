/*
https://leetcode.com/problems/reverse-words-in-a-string/

Учитывая входную строку s, измените порядок слов на противоположный.
Слово определяется как последовательность не пробельных символов. Слова в s будут разделены хотя бы одним пробелом.
Возвращает строку слов в обратном порядке, объединенных одним пробелом.
Обратите внимание , что s может содержать начальные или конечные пробелы или несколько пробелов между двумя словами.
Возвращаемая строка должна содержать только один пробел, разделяющий слова. Не включайте никаких дополнительных пробелов.

Input: s = "  hello   world  "
Output: "world hello"

Алгоритм:
1. Ввод строки +
2. Убрать лишние пробелы (в начале, в тексте (более 1), в конце) ++
3. Разбить строку по словам +
4. Собрать строку из массива в обратном порядке+
 */

package org.example.Seminar1.hw1;

import static org.example.Lib.receiveStr;

public class Task {
    public static void main(String[] args) {
        String text = receiveStr().trim();
//        text = text.replaceAll("\\s+", " "); // - первый вариант замены лишних пробелов
        while (text.contains("  ")) { // - второй вариант замены лишних пробелов
            String replace = text.replace("  ", " ");
            text = replace;
        }
        String[] words = text.split(" ");
        String revText = words[words.length - 1];
        for (int i = words.length - 2; i >= 0; i--) {
            revText += " " + words[i];
        }
        System.out.printf("Искомая строка: %s", revText);
    }
}