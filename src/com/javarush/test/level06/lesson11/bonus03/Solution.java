package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] ints = new int[5];
        for (int i = 0; i < 5; i++)
        {
            ints[i] = Integer.parseInt(reader.readLine());
        }
        boolean timeToStop = false;
        while (!timeToStop)
        {
            timeToStop = true;
            for (int i = 0; i < 5 - 1; i++)
            {
                if (ints[i] > ints[i + 1])
                {
                    int a = ints[i];
                    ints[i] = ints[i + 1];
                    ints[i + 1] = a;
                    timeToStop = false;
                }
            }
        }
        for (int i = 0; i < 5; i++)
        {
            System.out.println(ints[i]);
        }

    }

    private static int min(int a, int b)
    {
        return a < b ? a : b;
    }
}
