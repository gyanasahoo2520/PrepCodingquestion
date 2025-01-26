package Basics;

public class FactorOfNums {
    public static void main(String[] args) {
//        int num = 10;
//
//        System.out.println( "Factors of " + num + " are " );
//
//        // finding and printing factors b/w 1 to num
//        for(int i = 1; i <= num; i++)
//        {
//            if(num % i == 0)
//                System.out.println(i + " ");
//        }
        int num = 100;
        getFactors (num);
    }

    static void getFactors (int num)
    {

        for (int i = 1; i <= (num/2); i++)
        {
            if (num % i == 0)
            {
                System.out.print(i + " ");
            }
        }
        // print the number itself too
        System.out.print(num);
    }
}
