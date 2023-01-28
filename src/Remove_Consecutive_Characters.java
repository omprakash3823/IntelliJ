import java.util.Arrays;
import java.util.Stack;

public class Remove_Consecutive_Characters {
    public static void main(String[] args) {

        String S="aabbcc";
        System.out.println(removeConsecutiveCharacter(S));
    }
    public static String removeConsecutiveCharacter(String S){

           String St=S.concat(" ");
            String sc="";
//        Stack<Character> str=new Stack<>();
        for (int i = 0; i < St.length()-1; i++) {
            if(St.charAt(i)!=St.charAt(i+1)){
                sc=sc.concat(String.valueOf(St.charAt(i)));
            }
        }
        return sc;
    }
}
