import java.util.Locale;

public class lower_case {
    public static void main(String[] args) {
        String s="RANAM";
        System.out.println(toLower(s));
    }

    static String toLower(String s) {
        // code here
        String s1 = s.toLowerCase(Locale.forLanguageTag(s));
        return s1;
    }
    
    
}
