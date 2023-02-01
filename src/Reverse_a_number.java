import java.util.Scanner;

public class Reverse_a_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:- ");
        int a=sc.nextInt();
        int b ,r=0;
        while(a>0){
            b=a%10;
            r=r*10+b;
            a=a/10;
        }
        System.out.println(r);
    }
}
