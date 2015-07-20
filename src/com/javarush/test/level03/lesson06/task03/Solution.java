package com.javarush.test.level03.lesson06.task03;

/* Семь цветов радуги
Выведи на экран текст - семь цветов радуги.
В каждой строке должно быть по три цвета, в последней - один.
Цвета в строках разделяй пробелом.
Запомни: буквы Ё в тестах нигде нет.
Чтобы тесты проходили правильно, во всех задачах заменяй Ё на Е.
*/

public class Solution {
    public static void main(String[] args) {
        String[] colors = {"красный", "оранжевый", "желтый", "зеленый", "голубой", "синий", "фиолетовый"};
        String ending = " ";
        for (int i = 0; i < colors.length; i += 3) {
            for (int j = 0; j < 3; j++) {
                if (i + j < colors.length) {
                    if (j != 2 && i + j != colors.length - 1) {
                        System.out.print(colors[i + j] + ending);
                    } else {
                        System.out.print(colors[i + j]);
                    }
                }
            }
            System.out.print("\n");
        }

    }
}