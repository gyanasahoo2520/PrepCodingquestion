package String_Questions;

import java.util.Arrays;

public class Anagram_Checker {
    public static void main(String[] args) {
        String str1 = "INTEGER";
        String str2 = "TEGERNI";
        boolean answer=checkAnagrams(str1,str2);
        if(answer)
            System.out.println("Strings are Anagram");
        else
            System.out.println("Strings are not Anagram");
    }

    private static boolean checkAnagrams(String str1, String str2) {
        if(str1.length()!=str2.length())
            return false;
        char[] a=str1.toLowerCase().toCharArray();
        char[] b=str2.toLowerCase().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<a.length;i++){
            if (a[i] != b[i])
                return false;
        }
        return true;
    }
}
