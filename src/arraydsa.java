import java.util.Scanner;

public class arraydsa {

// this is print method
    public static void printarray(int[] arr){
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
  }
// this is the class of method

    public static void arraydemo(){
        int[] myarray=new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < myarray.length; i++) {
            myarray[i]=sc.nextInt();

        }
        printarray(myarray);
    }
    public static void removear(){
        int[] arr= new int[6];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int count=0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] % 2 != 0) {
                count= count + 1;
            }
        int[] result=new int[count];

        int idx=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] %2 != 0) {
                 result[idx]=arr[i];
                idx = idx + 1;
            }
        }
        printarray(result);

        }




    // this is main method
    public static void main(String[] args) {
        arraydsa array1=new arraydsa();
        arraydsa.arraydemo();
        arraydsa.removear();


    }
}
