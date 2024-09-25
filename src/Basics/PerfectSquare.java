package Basics;

public class PerfectSquare {
    public static void main(String[] args) {
        int n=36;
        checkPerfect1(n);
    }

    private static void checkPerfect(int n) {
        boolean check=false;
        if(n>0){
            int root=(int)Math.sqrt(n);
            if (root*root==n) check=true;
        }
        if(check)
            System.out.println("true");
        else
            System.out.println("false");
    }
    private static void checkPerfect1(int n) {
        boolean check=false;
        if(n>0){
            if(Math.ceil((double)Math.sqrt(n))==Math.floor((double)Math.sqrt(n)))
                check=true;
        }
        if(check)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
