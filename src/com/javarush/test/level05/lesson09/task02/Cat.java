package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    private static final String STANDARD_COLOR = "Black&White";
    private final int STANDARD_WEIGHT = 3;
    private static final int STANDARD_AGE = 3;
    private String name;
    private final int weight;
    private final int age;
    private String color;
    private String address;
    //напишите тут ваш код

    public Cat(String name)
    {
        this.name = name;
        this.weight = STANDARD_WEIGHT;
        this.age = STANDARD_AGE;
        this.color = STANDARD_COLOR;
    }

    public Cat(String name, int weight, int age)
    {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = STANDARD_COLOR;
    }


    public Cat(String name, int age)
    {
        this.name = name;
        this.weight = STANDARD_WEIGHT;
        this.age = age;
        this.color = STANDARD_COLOR;
    }

    public Cat(int weight, String color)
    {
        this.weight = weight;
        this.color = color;
        this.age = STANDARD_AGE;
    }

    public Cat(int weight, String color, String address)
    {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = STANDARD_AGE;
    }
}
