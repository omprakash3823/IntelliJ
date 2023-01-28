public class stringq1 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
//        String str = s.replace(",", "").replaceAll("\\s", "").replaceAll(":", "");
//        String result = str.replaceAll("\\s", "");
//            s.replaceAll("[^A-Za-z0-9]", "");
//        String res = result.replaceAll(":", "");
//        System.out.println(str);
//        System.out.println(result);
//        System.out.println(res);
//        int j=res.length();
        String stri= "";
        for (int i = s.length()-1; i >=0; i--) {
            stri = stri.concat(String.valueOf(s.charAt(i)));
        }

        System.out.println(stri);
        System.out.println(stri.equalsIgnoreCase(s));

        return false;
    }
}

