package Basics;

//A strong number is a number where the sum of the factorials of each digit is equal to the number itself

public class StrongNumber {
    public static void main(String[] args) {
        int number=105;
        if(findPerfect(number))
            System.out.println(number+ " is a Perfect number");
        else
            System.out.println(number+ " is not a Perfect number");
    }

    private static boolean findPerfect(int n) {
        int temp=n,sum=0,digit;
        while(temp>0){
            digit=temp%10;
            sum+=facto(digit);
            temp=temp/10;
        }
        return (sum==n);
    }

    private static int facto(int num) {
        if(num==0 || num==1)
            return 1;
        int fact=1;
        for(int i=num;i>1;i--){
            fact=fact*i;
        }
        return fact;
    }

}
