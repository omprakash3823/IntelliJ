import java.util.*;
public class method_demo {
    static int sum(int x, int y) {
        int z = x + y;
        return z;
    }

    static int sub(int x, int y) {
        int z = x - y;
        return z;
    }
    static int multi(int x, int y) {
        int z = x * y;
        return z;
    }
    static int div(int x, int y) {
        int z = x / y;
        return z;
    }




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d=0,e=0,f=0,g=0;
        System.out.println("enter two number");
        a=sc.nextInt();
        b= sc.nextInt();
        System.out.println("choose the operatoe 1.Sum 2.Minus 3.Multiply 4.Divide");
        c= sc.nextInt();
        if(c==1){
            d=sum(a,b);
            System.out.println(d);
        }
        else if(c==2){
            e=sub(a,b);
            System.out.println(e);
        }

        else if(c==3){
            f=multi(a,b);
            System.out.println(f);
        }
        else if(c==4){
            g=div(a,b);
            System.out.println(g);
        }


        //  c=sum(a,b);
       // System.out.println(d);

    }
}
