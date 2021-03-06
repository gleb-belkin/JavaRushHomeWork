package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s  = bufferedReader.readLine();
        String s1  = bufferedReader.readLine();
        if (s.equals(s1))
        {
            System.out.println("Имена идентичны");
        } else
        {
            if (s.length() == s1.length())
            {
                System.out.println("Длины имен равны");
            }
        }
    }
}
