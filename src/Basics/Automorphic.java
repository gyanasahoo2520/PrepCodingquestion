package Basics;

/*
A number is called an automorphic number if and only
 if the square of the given number ends with the same number itself
*/

public class Automorphic {
    public static void main(String[] args) {
        int num=15;
        System.out.println(isAuto(num) ? "Automorphic" : "Not Automorphic");
//        System.out.println(isAuto1(num) ? "Automorphic" : "Not Automorphic");
    }

    private static boolean isAuto(int n) {
        if(n<0)
            n=-n;
        int square=n*n;
        while(n>0){
            if(n%10 != square%10)
                return false;
            n=n/10;
            square=square/10;
        }
        return true;
    }
    private static boolean isAuto1(int n){
        int sq=n*n;

        String nStr=Integer.toString(n);
        String sqStr=Integer.toString(sq);

        return (sqStr.endsWith(nStr));
    }

}
