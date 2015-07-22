package com.javarush.test.level04.lesson16.home02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int i1 = Integer.parseInt(bufferedReader.readLine());
        int i2 = Integer.parseInt(bufferedReader.readLine());
        int i3 = Integer.parseInt(bufferedReader.readLine());
        if (i1 < i2 && i1 > i3 || i1 < i3 && i1 > i2)
        {
            System.out.println(i1);
        } else if (i2 < i1 && i2 > i3 || i2 < i3 && i2 > i1)
        {
            System.out.println(i2);
        } else if (i3 < i1 && i3 > i2 || i3 < i2 && i3 > i1)
        {
            System.out.println(i3);
        }
    }
}
