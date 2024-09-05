package Basics;

/* An abundant number is a positive integer for which the sum of its
   proper divisors (excluding the number itself) is greater than the number itself */

public class AbudantNumber {
    public static void main(String[] args) {
        int num=12;
        isAbudant(num);
    }

    private static void isAbudant(int n) {
        int sum=0;
        for(int i=1;i<=n/12;i++){
            if(n%i==0)
                sum=sum+i;
        }
        if(sum>n){
            System.out.println(n+" is an Abudant Number");
            System.out.println("The Abudance is "+(sum-n));
        }else
            System.out.println(n+" is not an Abudant Number");
    }

}
