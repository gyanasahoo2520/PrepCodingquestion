package Basics;

public class Even_odd {
    public static void main(String[] args) {
        int number = 10;

        //Method 1
//        if (number % 2 == 0)
//            System.out.println(number + " is Even");
//        else
//            System.out.println(number + " is odd");

        //Method 2
        String status = number % 2 == 0 ? " is Even" : " is Odd";
        System.out.println (number + status);
    }
}
