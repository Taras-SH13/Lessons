package com.company;

public class Arrays_of_Strings {
    public static void main(String[] args) {

        String[] strings = new String[3];
        strings[0] = "Hi!";
        strings[1] = "By By!";
        strings[2] = "Java";
        for (String string : strings) {
            System.out.println(string);
        }
        int[] numbers={1,2,3,4,5};
        int sum=0;
        for (int x:numbers) {
            sum=sum+x;


        }
        System.out.println(sum);
    }
}
