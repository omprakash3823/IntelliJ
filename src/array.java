import org.codehaus.groovy.transform.SourceURIASTTransformation;

import java.util.Scanner;

public class array {
    public static int large(int[] ar){
        int lar=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            if(ar[i] > lar) {
                lar=ar[i];
            }
        }
        return lar;
    }
    public static int[] takeinput(){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("enter element in array:- ");
        int ar[]=new int[a];
        for(int i=0;i<a;i++) {
            ar[i] = sc.nextInt();
        }
        return ar;
    }
    public static void output(int ar[]){
        System.out.println("enntered array are :- ");
        int a=ar.length;
        for(int i=0;i<a;i++){
            System.out.println(ar[i]);
        }
    }
    public static void main(String[] args) {
        System.out.println("enter number of element in array");
        int array[] = takeinput();
        output(array);
        int largest=large(array);
        System.out.println("largest integer are :- "+largest);
    }
}
