package Basics;

import javax.swing.*;

public class Even_odd {
    public static void main(String[] args) {
        int number = 10;

        //Method 1
//        if (number % 2 == 0)
//            System.out.println(number + " is Even");
//        else
//            System.out.println(number + " is odd");

        //Method 2
//        String status = number % 2 == 0 ? " is Even" : " is Odd";
//        System.out.println (number + status);

//        method 3 without % operator
//        if(isEven(number)==0)
//            System.out.println("Even");
//        else
//            System.out.println("Number is Odd");

//        method 4 without % operator
        if((number/2)*2==number)
            System.out.println("Even");
        else
            System.out.println("odd");
    }

    private static int isEven(int num) {
        return (num & 1);
    }
}
