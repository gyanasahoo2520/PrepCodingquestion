package String_Questions;

public class Pallindrome {
    public static void main(String[] args) {
        String s="madam";
        checkPall(s);
    }

    private static void checkPall(String s) {
        String str=s.toLowerCase();
        StringBuilder temp=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            temp.append(str.charAt(i));
        }
        String ans=temp.toString();
        if(str.equals(ans))
            System.out.println("Pallindrome");
        else
            System.out.println("Not Pallindrome");
    }
}
