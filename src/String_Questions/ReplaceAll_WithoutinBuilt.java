package String_Questions;

public class ReplaceAll_WithoutinBuilt {
    public static void main(String[] args) {
        String original="Geeks For Geeks";
        char replace='e';
        char replacement='a';

        char[] target=new char[original.length()];
        for(int i=0;i<original.length();i++){
            if(original.charAt(i)==replace)
                target[i]=replacement;
            else
                target[i]=original.charAt(i);
        }
        String result=new String(target);
        System.out.println(result);
    }
}
