package com.javarush.test.level03.lesson06.task01;

/* Мама мыла раму
Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
МылаРамуМама
РамуМамаМыла
...
*/

public class Solution {
    public static void main(String[] args) {
        String a = "Мама";
        String b = "Мыла";
        String c = "Раму";
        printCustom(a, b, c);
        printCustom(b, a, c);
        printCustom(c, a, b);

    }

    private static void printCustom(String a, String b, String c) {
        System.out.println(a + b + c);
        System.out.println(a + c + b);
    }
}