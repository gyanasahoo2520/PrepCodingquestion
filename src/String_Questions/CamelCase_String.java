package String_Questions;

public class CamelCase_String {
    public static void main(String[] args) {
        String s="in get intern at geeksforgeeks";
//        camelCase(s);
        System.out.println(camelCase1(s));
    }

    private static void camelCase(String s) {
        int i=0;
        while(i<s.length()){
            s=Character.toUpperCase(s.charAt(0))+s.substring(1);
            char ch=s.charAt(i);
            if(ch==' '){
                char nextChar=Character.toUpperCase(s.charAt(i+1));
                s=s.substring(0,i+1)+nextChar+s.substring(i+2);
//                break;
            }
            i++;
        }
        System.out.println(s);
    }
    private static String camelCase1(String s) {
        StringBuilder sb=new StringBuilder();
        char ch=Character.toUpperCase(s.charAt(0));
        sb.append(ch);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==' ' && i<s.length()-1){
                sb.append(s.charAt(i));
                i++;
                sb.append(Character.toUpperCase(s.charAt(i)));
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
