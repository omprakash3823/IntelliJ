import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class string_case_sort {
    public static void main(String[] args) {
        String str="DDTVUCTBuhdu";
        System.out.println(caseSort(str));
    }
    //Function to perform case-specific sorting of strings.
    public static <Char> String caseSort(String str)
    {
        // Your code here
       char[] array=str.toCharArray();
        Arrays.sort(array);
        str=new String(array);
        return str;
    }




}
