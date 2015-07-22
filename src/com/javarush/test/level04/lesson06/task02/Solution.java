package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(bufferedReader.readLine());
        int i1 = Integer.parseInt(bufferedReader.readLine());
        int i2 = Integer.parseInt(bufferedReader.readLine());
        int i3 = Integer.parseInt(bufferedReader.readLine());
        System.out.println(Math.max(Math.max(i, i1), Math.max(i2, i3)));
    }
}
