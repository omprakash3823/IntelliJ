import java.util.Collection;

public class Longest_Palindromic_Substring {
    public static void main(String[] args) {
        String s="babad";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        String palim = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String b = "";
//                System.out.println(s.substring(i, j));
                String a = s.substring(i, j);
                for (int k = a.length() - 1; k >= 0; k--) {
//                        b=b.concat(a[k]);
                    b = b.concat(String.valueOf(a.charAt(k)));

                }
                System.out.println("ye hai asli khel    " + b);
                if (a.equalsIgnoreCase(b)) {
                    System.out.println(a.length());
                    System.out.println(palim.length());
                    if (a.length() > palim.length()) {

                        palim =a;
//                        System.out.println("after backchodi   " + palim);

                    }
                }


            }
        }
        return palim;

    }

}
// it take more time complexity;