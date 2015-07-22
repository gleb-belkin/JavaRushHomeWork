package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

/*
*Solution comment: equal input numbers are not treated properly
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
        int[] ints = {i,i1,i2};
        int lastMax = 0;
        for (int j = 0; j < 3; j++)
        {
            int max = Math.min(i, Math.min(i1, i2));
            for (int anInt : ints)
            {
                if (anInt > max && ((j != 0 && anInt < lastMax) || j == 0))
                {
                    max = anInt;
                }
            }
            lastMax = max;
            System.out.println(max);
        }
    }
}
