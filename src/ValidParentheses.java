import javax.lang.model.type.NullType;
import java.util.*;
import java.lang.String;

public class ValidParentheses {
    public static void main(String[] args) {
        String s="()}";
        System.out.println(isValid(s));
    }


    public static boolean isValid(String s) {

        Stack<Character> st = new Stack();
        System.out.println(s.toCharArray());
        for (char c : s.toCharArray()){
            if(c=='(' || c=='[' || c=='{'){
                st.add(c);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                if(c==']' && st.peek()!='[') return false;
                if(c=='}' && st.peek()!='{') return false;
                if(c==')' && st.peek()!='(') return false;
                st.pop();
            }
        }
        return st.isEmpty();





    }

}
