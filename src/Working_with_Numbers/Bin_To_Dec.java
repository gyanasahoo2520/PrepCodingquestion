package Working_with_Numbers;

public class Bin_To_Dec {
    public static void main(String[] args) {
//        int bin=10010;
//        int dec=0,temp=0,n=0;
//        while(bin>0){
//            temp=bin%10;
//            dec+=temp*Math.pow(2,n);
//            bin=bin/10;
//            n++;
//
//        }
//        System.out.println("Decimal : " + dec);


        String str="1010";
        System.out.println("Binary value: "+str);

        int n=Integer.parseInt(str, 2);

        System.out.println("Decimal value: "+n);
    }
}
