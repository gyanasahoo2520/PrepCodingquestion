package Stack_DS;

import java.util.Stack;

public class BalancedBracket {
    public static void main(String[] args) {
        String expr="([{}])";
        if(checkBalance(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }

    private static boolean checkBalance(String expr) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<expr.length();i++){
            char ch=expr.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
                continue;
            }
            if(st.isEmpty())
                return false;

            char check;
            switch (ch){
            case ')':
                check=st.pop();
                if(check=='{' || check=='[')
                    return false;
                break;

            case '}':
                check=st.pop();
                if(check=='(' || check=='[')
                    return false;
                break;

            case ']':
                check=st.pop();
                if(check=='{' || check=='(')
                    return false;
                break;
            }
        }
        return (st.isEmpty());
    }
}
