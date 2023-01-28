import java.util.Scanner;

public class addarray {
    public void add(int[] arr, int p, int q) {
         int count= arr.length;
         int[] arra=new int[count+1];
         int j=0;
        for (int i = 0; i < arra.length; i++) {
            if(i==q){
                arra[i]=p;
            }
            else{
                arra[i]=arr[j];
                j++;
            }
        }
       printarray(arra);
    }

    public  void printarray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        addarray array2 = new addarray();
        int[] arr = new int[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int y, z;
        System.out.println("\nEnter the element do you want to add and its position");
        y = sc.nextInt();
        z = sc.nextInt();
        if (z <= arr.length) {
            array2.add(arr, y, z);
        }
        else{
            System.out.println("plz enter between the length of arr");
        }
    }
}
