// Print all prime numbers in a given range. Range will be taken from user as input

import java.util.ArrayList;
import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower number of the Range: ");
        int l = sc.nextInt();
        System.out.print("\nEnter upper number of the range: ");
        int u = sc.nextInt();
        for (int i = l; i <= u; i++) {
            int count = 0;
            if (i == 0 || i == 1) {
                continue;
            }
            for (int j = 1; j <= (i/2); j++) {
                if (i % j == 0) {
                    if(count<=2) {
                        count = count + 1;
                    }
                }
            }
            if (count <= 1) {
                System.out.println(i);
            }
        }

    }
}
