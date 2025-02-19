package Basics;

public class PrimeNumber {
    public static void main(String[] args) {
//        int number=17;
//        isPrime(number);
        int num = 25;

        if (isprime(num))
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
//        boolean isprime=true;
//        if(num<2)
//            isprime=false;
//        else {
////            for(int i=2;i<=num/2;i++)
//            for(int i=2;i<=Math.sqrt(num);i++)
//            {
//                if(num%i==0){
//                    isprime=false;
//                    break;
//                }
//            }
//        }
//        if(isprime)
//            System.out.println("Prime");
//        else
//            System.out.println("Not Prime");
    }

    public static void isPrime(int n) {
        int count = 0;
        if (n < 2) {
            System.out.println("Not Prime");
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        if (count > 2)
            System.out.println("The given is number " + n + " is not prime");

        else
            System.out.println("The given is number " + n + " is prime");
    }

    private static boolean isprime(int n) {
        if (n <= 1)
            return false;
        else if (n == 2)
            return true;
        else if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isprime1(int n) {
        if (n < 2)
            return false;
        else {
            for (int i = 2; i <= n/2; i ++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
