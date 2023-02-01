public class Sum_of_All_Odd_Length_Subarrays {
    public static void main(String[] args) {
        int[]  arr={2,5,6,7,8};
        System.out.println(sumOddLengthSubarrays(arr));

    }
    public static int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                for (int k = i; k < j; k++) {
                    System.out.print(arr[k]+" ");


                }System.out.println("");
            }

        }


        return sum;
    }
}
