package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] ints = new int[10];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < ints.length; i++)
        {
            ints[i] = Integer.parseInt(bufferedReader.readLine());
        }
        for (int i = 0; i < ints.length/2; i++)
        {
            int i1 = ints[ints.length - i -1];
            ints[ints.length - i -1] = ints[i];
            ints[i] = i1;
        }
        for (int i = 0; i < ints.length; i++)
        {
            System.out.println(ints[i]);
        }
    }
}
