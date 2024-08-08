package Working_with_Numbers;

public class HCF {
    public static void main(String[] args) {
//        int num1 = 36, num2 = 60, hcf;
//
//        while (num1 != num2)
//        {
//            if (num1 > num2)
//                num1 -= num2;
//            else
//                num2 -= num1;
//        }
//
//
//        System.out.println("The HCF: "+ num1);

        int num1 = 36, num2 = 60, hcf=0;

        for (int i = 1; i <= num1 || i <= num2; i++)
        {
            if (num1 % i == 0 && num2 % i == 0)
                hcf = i;
        }

        System.out.println("The HCF: "+ hcf);

//        int num1 = 36, num2 = 60, hcf;
//
//        hcf = getHCF (num1, num2);
//        System.out.println ("The HCF: " + hcf);
//    }
//
//    static int getHCF (int num1, int num2)
//    {
//        if (num1 == 0)
//            return num2;
//
//        if (num2 == 0)
//            return num1;
//
//        if (num1 == num2)
//            return num1;
//
//        if (num1 > num2)
//            return getHCF (num1 - num2, num2);
//
//        return getHCF (num1, num2 - num1);
    }
}
