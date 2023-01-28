import groovy.json.JsonParser;

import java.util.Scanner;

public class bubble_sort {

    private static void bs(int[] arr, int n) {
        int temp, j;
        for (int i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many number do want to enter ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter element of array for bubble sort");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bubble_sort bs = new bubble_sort();
        bubble_sort.bs(arr, n);
        bubble_sort.print(arr);
    }

    private static void print(int[] arr) {


        for (int i = 0; i < arr.length; i++) {
            System.out.println(" " + arr[i]);
        }

    }
}
