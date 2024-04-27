package Basics;

public class Fibonacci {
    static int a = 0, b = 1, nextTerm;
    static int fibb(int n){
        if(n<=1){
            return n;
        }
        return fibb(n-1)+fibb(n-2);
    }
    public static void main(String[] args) {
//        int n=5;
//        System.out.println(fibb(n));
        int n=5;
        System.out.print (a + " , " + b + " , ");

        // n-2 as 2 terms already printed
        fibbuptoNth (n - 2);
    }


    // write fibonacci up to nth term
    static int fibbuptoNth(int n){
        if (n > 0)
        {
            nextTerm = a + b;
            a = b;
            b = nextTerm;

            System.out.print (nextTerm + " , ");
            fibbuptoNth (n - 1);
        }
        return 0;
    }
}
