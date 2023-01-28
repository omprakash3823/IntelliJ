import java.util.Scanner;

// Count number of digits in a number
public class Count_number_in_digit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the digit:- ");
        int digit=sc.nextInt();
        int count=1;
        while(digit>9){
            digit=digit/10;
            count+=1;
        }
        System.out.println(count);

    }
}
