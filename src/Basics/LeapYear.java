package Basics;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2100;

        //method-1
//        if (year % 400 == 0)
//            System.out.println (year + " is a Leap Year");
//
//        else if (year % 4 == 0 && year % 100 != 0)
//            System.out.println (year + " is a Leap Year");
//
//        else
//            System.out.println (year + " is not a Leap Year");

        // Or we can Merge these Two conditions into one by ||
        // (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))

        //method-2
        int flag = (year%400 == 0) || (year%4==0 && year%100!=0 ) ? 1 : 0;
        if (flag == 1)
        {
            System.out.println (year + " is a Leap Year");
        }
        else
        {
            System.out.println (year + " is not a Leap Year");
        }
    }
}
