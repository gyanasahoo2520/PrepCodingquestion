package Basics;

public class StrongNumber1 {
    static int[] fact =new int[10];
    static void preCompute(){
        fact[0]=fact[1]=1;
        for (int i=2;i<10;i++){
            fact[i]=fact[i-1]*i;
        }
    }
    public static void main(String[] args) {
        preCompute();
        int number=145;
        if(isStrong(number))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    private static boolean isStrong(int n) {
        int sum=0;
        int temp=n,digit;
        while (temp>0){
            digit=temp%10;
            sum=sum+fact[digit];
            temp=temp/10;
        }
        return (sum==n);
    }

}
