public class Solution {

    public static void main(String[] args) {
        System.out.println(reverseWord("Geeks"));

    }

    public static String reverseWord(String str) {

        String string = "";

        for (int i = 0; i < str.length(); i++) {
            string = string.concat(str.charAt(str.length() - i - 1) + "");
        }

        return string;
    }
}
