package Basics;

/*
An Armstrong number is a positive integer that is equal to the sum of its digits,
 each raised to the power of the number of digits in the number
*/

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num=153;
        int len=Len(num);
        if(armstrong(num,len))
            System.out.println(num + " is Armstrong");
        else
            System.out.println(num + " is not Armstrong");
    }
    static int Len(int n){
        int len=0;
        while(n>0){
            len++;
            n=n/10;
        }
        return len;
    }
    static boolean armstrong(int n,int l){
        int sum=0,temp,digit;
        temp=n;
        while (temp>0){
            digit=temp%10;
            sum=sum+(int)Math.pow(digit,l);
            temp=temp/10;
        }
        return n==sum;
    }
}
