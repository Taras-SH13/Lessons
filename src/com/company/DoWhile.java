package com.company;

import java.util.Scanner;

public class DoWhile {
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        int value;
        int value2;
        do{
            System.out.println("Enter number 5");
            value=scanner.nextInt();
            value2=value;
            if (value2!=5){
                System.out.println("No! "+"Try again!");}
        }while (value!=5);
        System.out.println("It's okey you enter number 5");



    }

}
