import java.util.Scanner;

public class arrreverse {

    public  void printarray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


    public  void reverse(int[] arr) {
        int count = arr.length;
        int[] arrr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            count = count - 1;
            arrr[count] = arr[i];

        }
        printarray(arrr);
    }

    public static void main(String[] args) {
        arrreverse array1 = new arrreverse();
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element:- ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        array1.printarray(arr);
        array1.reverse(arr);
    }
}
