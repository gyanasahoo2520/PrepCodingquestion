package Basics;

public class PrimeNumber {
    public static void main(String[] args) {
        int number=17;
        isPrime(number);
    }
    public static void isPrime(int n){
        int count =0;
        if(n<2){
            System.out.println("Not Prime");
            return;
        }
        for (int i=1;i<=n;i++){
            if(n%i==0)
                count++;
        }
        if (count > 2)
            System.out.println ("The given is number " + n + " is not prime");

        else
            System.out.println ("The given is number " + n + " is prime");
    }
}
