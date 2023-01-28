import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
//         float mat,eng,hin,sci,sst,percent;

        float arr[]=new float[100], temp =0;
        int i ;
        float percent;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the all 5 subject marks ");
        for( i=1;i<6;i++){
            arr[i]= sc.nextFloat();
            temp=temp+arr[i];
        }

      /*  float total = 0;
        float arr[] = new float[6];
        for (int i = 1; i < 6; i++) {
             arr[i] = sc.nextFloat();

            total += arr[i];
        }
        float percentage =( total/500)*100;

        System.out.println("Total Percentage :"+percentage+"%");*/


//        mat=sc.nextFloat();
////        System.out.println("enter the english marks ");
//        eng=sc.nextFloat();
////        System.out.println("enter the hindi marks ");
//        hin=sc.nextFloat();
////        System.out.println("enter the science marks ");
//        sci=sc.nextFloat();
////        System.out.println("enter the social science marks ");
//        sst=sc.nextFloat();
         percent = temp / 5;
        System.out.println("percentage of student marks= " + percent);


    }
}
