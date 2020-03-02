package com.company;

import java.util.Scanner;

public class SwitchLesson {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input your age--");
        String age=scanner.nextLine();//это ввод с консоли
        switch (age){
            case "ноль":
                System.out.println("Ты родился");
                break;
            case "семь":
                System.out.println("Ты пошел в школу");
                break;
            case "восемьнадцать":
                System.out.println("Ты закончил школу");
                break;


        }

}
}
