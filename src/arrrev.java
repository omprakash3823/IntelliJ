import groovy.json.JsonOutput;

import java.util.*;

public class arrrev {


    public static void printarray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void remove(int[] arr) {
        System.out.print("\nenter the number do you want to remove :-");
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int count = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == y) {
                count = count - 1;
            }
        }
        if (count == arr.length) {
            System.out.println(" alert :- Entered number is not matched ");
        }
        int idx = 0;
        int[] arrr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != y) {
                arrr[idx] = arr[i];
                idx += 1;
            }
        }
        printarray(arrr);
    }


    public static void main(String[] args) {
        arrrev array2 = new arrrev();
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element:- ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        printarray(arr);
        arrrev.remove(arr);
    }
}
