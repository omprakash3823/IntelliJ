import java.util.Scanner;

public class Quetion4 {
    public static void main(String[] args) { // Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
  int num = sc.nextInt();
//  int num = 1002000300;
        int count = 0; while (num > 0) {
            if (num % 10 == 0) { count++;
            }
            num = num / 10;
        }
        System.out.println("The count is: " + count);
   sc.close();
    }

}
