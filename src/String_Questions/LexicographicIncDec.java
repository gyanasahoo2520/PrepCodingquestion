package String_Questions;

/*
This Java program modifies a string by incrementing the ASCII value of characters at even
indices and decrementing those at odd indices.

input="hello"
output="idmkp"

 */

public class LexicographicIncDec {
    public static void main(String[] args) {
        String input = "hello";
        String modifiedString = modifyString(input);
        System.out.println("Original String: " + input);
        System.out.println("Modified String: " + modifiedString);
    }

    private static String modifyString(String s) {
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                sb.setCharAt(i,incrementCh(sb.charAt(i)));
            }else{
                sb.setCharAt(i,decreamentCh(sb.charAt(i)));
            }
        }
        return sb.toString();
    }

    private static char incrementCh(char ch) {
        if(ch=='z') return 'a';
        if(ch=='Z') return 'A';
        return (char)(ch+1);
    }
    private static char decreamentCh(char ch) {
        if(ch=='a') return 'z';
        if(ch=='A') return 'Z';
        return (char)(ch-1);
    }
}
