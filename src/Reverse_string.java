import java.util.*;
import java.lang.String;
public class Reverse_string {
    public static void main(String[] args) {
        String S="rgFtrG";
        System.out.println(revStr(S));
    }
    static String revStr(String S) {
        // code here
        String str="";
        int  j=S.length()-1;
        for(int i=0;i<S.length();i++){
            String s=str.concat(String.valueOf(S.charAt(i)));
        }
        return str;
    }
}
