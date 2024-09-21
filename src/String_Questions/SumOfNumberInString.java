package String_Questions;

public class SumOfNumberInString {
    public static void main(String[] args) {
        String str = "1xyz23";
        System.out.print("Sum: ");
        System.out.println(findSum(str));
    }

    private static int findSum(String str) {
        String tempSum="0";
        int sum=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch))
                tempSum+=ch;
            else{
                sum+=Integer.parseInt(tempSum);
                tempSum="0";
            }
        }
        return sum + Integer.parseInt(tempSum);
    }
}
