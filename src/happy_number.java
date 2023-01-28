public class happy_number {

    public static void main(String[] args) {
        int n = 7;
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {

//        int[] ary = new int[ Integer.toString(n).length()];
        int i = 0;
        int sum=0;
  do {
      sum = 0;
      while (n != 0) {
          int d = (int) (n % 10);
          sum += d * d;
          n /= 10;
      }
      n=sum;
      System.out.println(sum);
  }while (sum>1);

  if(sum==1){
      return true;
  }
        return false;
    }
}
