package String_Questions;

public class Toggle {
    public static void main(String[] args) {
        String str = "PrEpInsTa";
        StringBuilder str1 = new StringBuilder();

        for (int i = 0; i <str.length() ; i++) {
            if(Character.isUpperCase(str.charAt(i))){
                str1.append(Character.toLowerCase(str.charAt(i)));
            }
            else {
                str1.append(Character.toUpperCase(str.charAt(i)));
            }
        }
        System.out.println(str);
        System.out.println(str1);
    }
}
