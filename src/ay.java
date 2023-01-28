import java.util.ArrayList;
import java.util.Collections;

public class ay {
    public long findMinDiff(ArrayList<Integer> a, int n, int m) {
        // your code here
        Collections.sort(a);
        System.out.println(a);
        long min_diff = 9000000L;

        for (int i = 0; i < a.size(); i++) {

            long k = a.get(i);
            long l = a.get(m - 1);
            long c = k - l;
            if (c < min_diff) {
                min_diff = k;
            }
        }
        return min_diff;
    }
}
