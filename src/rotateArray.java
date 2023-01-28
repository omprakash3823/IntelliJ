public class rotateArray {
    void leftRotate(int[] arr, int n, int d) {
        int temp=0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                temp = arr[i];
            }


            if (i == n - 1) {
                arr[i] = temp;
                break;
            }
            arr[i] = arr[i + 1];
        }


    }
}
