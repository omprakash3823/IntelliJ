// Count number of zeros in a digit

import java.util.Scanner;

public class Count_number_of_zero {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int n=sc.nextInt();
        int count=0;
        if(n==0){
            System.out.println("1");
        }
        else {
            while(n>9){
                if(n%10==0){
                    count=count+1;
                }
                n=n/10;
            }System.out.println(count);
        }

    }
}
