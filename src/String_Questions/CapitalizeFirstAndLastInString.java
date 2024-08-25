package String_Questions;

public class CapitalizeFirstAndLastInString {
    public static void main(String[] args) throws Exception {
        String str = "I get intern at geeksforgeeks";
        String soln=getCaps(str);
        System.out.println(soln);
    }

    private static String getCaps(String str){
        StringBuilder ans=new StringBuilder();
        String[] temp=str.split("\\s");
        for(int i=0;i<temp.length;i++){
            if(temp[i].length()==1||temp[i].length()==2){
                ans.append(temp[i].toUpperCase());
                ans.append(" ");
            }else {
                char str1 = Character.toUpperCase(temp[i].charAt(0));
                char str2 = Character.toUpperCase(temp[i].charAt(temp[i].length() - 1));
                ans.append(str1);
                ans.append(temp[i].substring(1, temp[i].length()-1));
                ans.append(str2);
                ans.append(" ");
            }
        }
        return ans.toString();
    }

}
