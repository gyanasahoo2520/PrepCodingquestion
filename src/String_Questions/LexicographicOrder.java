package String_Questions;

/* Change every letter with next lexicographic alphabet
Input: string str = “abcdxyz”
Output: bcdeyza

Input: string str = “Java”
Output: Kbwb
 */

public class LexicographicOrder {
    public static void main(String[] args) {
        String input="GeeksForGeeks";
        String output=changeOrder1(input);
        System.out.println(output);
    }

    private static String changeOrder(String st) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<st.length();i++){
            int asci=st.charAt(i);
            if(asci==90)
                sb.insert(i,(char)(65));
            else if(asci==122)
                sb.insert(i,(char)(97));
            else if((asci>=65 && asci<90) || (asci>=97 && asci<122))
                sb.insert(i,(char) (asci+1));
        }
        return sb.toString();
    }

    private static String changeOrder1(String st){
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            if(ch == 'z')
                ans.append('a');
            else if(ch == 'Z')
                ans.append('A');
            else if((ch>='a' && ch<'z') || (ch>='A' && ch<'Z'))
                ans.append((char) (ch+1));
        }
        return ans.toString();
    }
}
