import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the two number:- ");
        int a=sc.nextInt();
        int b=sc.nextInt();
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
            System.out.println(gcd);
        }
    }
}
