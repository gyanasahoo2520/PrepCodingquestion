package Basics;

public class NivenNumber {
    public static void main(String[] args) {
        int num=15;
        System.out.println(checkNiven(num) ? "True" : "False");
    }

    private static boolean checkNiven(int n) {
        if(n>0 && n<11) return true;
        int sum=0;
        int temp=n;
        while(temp!=0){
            sum=sum+temp%10;
            temp=temp/10;
        }
        return (n%sum==0);
    }

}
