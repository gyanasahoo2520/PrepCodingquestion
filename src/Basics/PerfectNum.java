package Basics;

/*
A perfect number is a positive integer that is equal to the sum of its positive
 proper divisors, or divisors excluding the number itself
*/

public class PerfectNum {
    public static void main(String[] args) {
//        int n = 28, sum = 0;
//
//        for (int i = 1; i < n; i++)
//        {
//            if (n % i == 0)
//                sum = sum + i;
//        }
//
//        if (sum == n)
//            System.out.println (n + " Is a perfect number");
//        else
//            System.out.println (n + " Is not a perfect number");

        int num = 28;

        if (isPerfect(num))
            System.out.println (num + " Is a perfect number");
        else
            System.out.println (num + " Is not a perfect number");

    }

    private static boolean isPerfect(int num) {
        int sum = 0;

        // all divisors of num(excluding itself) can be found before num/2
        // remember put = sign as for even numbers like 28
        // half of it i.e. 14 would be divisor too e
        for (int i = 1; i <= num/2; i++){
            if (num % i == 0)
                sum = sum + i;
        }

        if (sum == num)
            return true;

        return false;
    }
}
