import java.util.*;

public class heap_sort {
     static void max_Heap(int[] array){
         int N = array.length;

         // Build heap (rearrange array)
         for (int i = N / 2 - 1; i >= 0; i--)
             heapify(array, N, i);
         // One by one extract an element from heap
         for (int i = N - 1; i > 0; i--) {
             // Move current root to end
             int temp = array[0];
             array[0] = array[i];
             array[i] = temp;

             // call max heapify on the reduced heap
             heapify(array, i, 0);
         }
     }
    static void heapify(int arr[], int N, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < N && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < N && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, N, largest);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int N = arr.length;

        for (int i = 0; i < N; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }



    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of array element do you want to print");
        a=sc.nextInt();
        int[] array=new int[a];

        System.out.println("enter element of array");
        for(int i=0;i<a;i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("entered element");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

        heap_sort max_heap=new heap_sort();
        heap_sort.max_Heap(array);
        System.out.println("sorted element");
        printArray(array);
    }
}
