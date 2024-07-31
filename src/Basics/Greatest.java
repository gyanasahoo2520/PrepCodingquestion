package Basics;

public class Greatest {
    public static void main(String[] args) {
        int x=10, y=20, z=30;
        //  if else-if method
        if(x>=y && y>=z)
            System.out.println(x + " is greatest");
        else if(y>=x && y>=z)
            System.out.println(y + " is greatest");
        else if(z>=x && z>=y)
            System.out.println(y + " is greatest");
        else
            System.out.println("all numbers are same/equal");

        // another if else-if method
        if(x>=y && y>=z)
            System.out.println(x + " is greatest");
        else if(y>=x && y>=z)
            System.out.println(y + " is greatest");
        else
            System.out.println(y + " is greatest");

        // using nested if-else
        if(x>=y){
            if(x>=z)
                System.out.println(x + " is greatest");
            else
                System.out.println(z + " is greatest");
        }
        else {
            if(y>=z)
                System.out.println(y + " is greatest");
            else
                System.out.println(z + " is greatest");
        }

        // using ternary operator
        int temp=x>y ? x:y;
        int largest=temp>z ? temp:z;
        System.out.println(largest + " is greatest");

        // using a single statement
        int large=z>(x>y ? x:y) ? z : ((x>y) ? x:y);
        System.out.println(large + " is greatest");
    }
}
