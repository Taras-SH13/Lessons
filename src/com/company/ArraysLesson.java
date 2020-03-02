package com.company;

public class ArraysLesson {
    public static void main(String [] args){
        int number=10;// это примитивный тип данных,коробка с целым числом 10
        char caracter='a';// это коробка с буквой а
        String s="Hello";// ссылочный тип данных
        String s1=new String("Hello");
        System.out.println(s);
        System.out.println(s1);
        int[] numbers=new int[5];// создаем массив, переменная numbers ссылается на массив
        System.out.println(numbers[4]);// это обращение к элементу массива numbers с индексом 4
        numbers[0]=15;// помещаем в элемент массива число 15
        numbers[1]=25;// помещаем в элемент массива число 25
        for (int i=0;i<numbers.length;i++){    //циклы очень удобны для инициализации членов массива
            numbers[i]=i+34;
        }

        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
        int [] numbers1={1,2,3,4,5};// второй способ объявления и инициализации массива
        for(int i=0;i<numbers1.length;i++){
            System.out.println(numbers1[i]);
        }
    }
}
