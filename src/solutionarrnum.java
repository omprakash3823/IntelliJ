public class solutionarrnum {
    public static void main(String[] args){
        System.out.println(hammingWeight(111067811));
    }
        public static int hammingWeight(int n) {
            int count=0;
            int number=n;
            int[] arr=new int[32];
            for(int i=0;i<32;i++){
                int remainder=number%2;
                number=number/2;
                System.out.println(number);
                arr[i]=remainder;
                if(arr[i]==1){
                    count=count+1;
                }

            }
            System.out.println(count);
            return count;
        }

    }

