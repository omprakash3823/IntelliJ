public class prime_no_code {

    public static void main(String[] args) {

        int lower = 1, upper = 1000000;
        int count = 0;
        boolean b = false;

        for (int n = lower; n <= upper; n++) {


            // 0, 1 negative numbers are not prime
            if (n < 2)
                b = false;

            // checking the number of divisors b/w 1 and the number n-1
            for (int i = 2; i < n; i++) {
                if (n % i == 0)
                    b = false;
            }

            // if reached here then must be true
            b = true;

        }
        System.out.println(b);

    }
}
