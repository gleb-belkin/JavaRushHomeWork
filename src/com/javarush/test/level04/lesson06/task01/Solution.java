package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
* First solution: line 24;
* Second solution: line 23;
* */

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        Scanner scanner = new Scanner(System.in);
        int i = Integer.parseInt(bufferedReader.readLine());
        int i1 = Integer.parseInt(bufferedReader.readLine());
//        int i1 = Integer.parseInt(scanner.nextLine());
//        System.out.println(Math.min(i,i1));
        if (i < i1)
        {
            System.out.println(i);
        } else
        {
            System.out.println(i1);
        }
    }
}