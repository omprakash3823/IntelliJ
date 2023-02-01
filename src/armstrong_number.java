//Armstrong Number with number of digit
//  n = 153, n = 1254
//  o/p : true, false

import java.util.Scanner;
import java.math.*;

public class armstrong_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to check armstrong number:- ");
        int a=sc.nextInt();
        int b,c = 0,count=1;
        int x=a,y=a;
        while(x>9) {
            x = x / 10;
            count += 1;
        }
        while (a>0){
            b=a%10;
            c= c+(int) Math.pow(b,count);
            a=a/10;
        }
        if(y==c){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }


    }
}
