import java.util.Arrays;
import java.util.Collection;

public class arthematicP {
    public static void main(String[] args) {
     String s="rama";
     String t="maraa";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        char array[] = s.toCharArray();
        char arr[] = t.toCharArray();
        Arrays.sort(array);
        Arrays.sort(arr);

        String str = new String(array);
        String st = new String(arr);

        System.out.println(str);
        System.out.println(st);
        if(str.equalsIgnoreCase(st)){
            return true;
        }
        return false;


    }
}
