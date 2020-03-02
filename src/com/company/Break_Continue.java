package com.company;

public class Break_Continue {
    public static void main(String[] args){
        int i=0;
        while(true){
            if(i==15){
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Wee are exit from loop");
        for(i=0;i<15;i++){
            if(i%2==0){
                continue;
            }
            System.out.println("With namber is" +i);
        }

        }
    }

