import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the two number:- ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a;
        int d=b;
        int gcd=1;

        if(a>b){
            for(int i=1;i<a;i++){
                if(a%i==0 && b%i==0){
                    gcd=i;
                }
            }
            System.out.println(gcd);
        }
        if(a<b){
            for(int i=1;i<b;i++){
                if(a%i==0 && b%i==0){
                    gcd=i;
                }
            }

        }
        int lcm=(c*d)/gcd;
        System.out.println(lcm);
    }
}
