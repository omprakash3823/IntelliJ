//Pattern
//10101
//01010
//10101
//01010
//10101


public class pattern_Q4_TT {
    public static void main(String[] args) {
        int a=5;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(i%2==0) {
                    if(j%2==0) {
                        System.out.print("1");
                    }
                    else{
                        System.out.print("0");
                    }
                }
                else{
                    if(j%2==0) {
                        System.out.print("0");
                    }
                    else{
                        System.out.print("1");
                    }

                }
            }
            System.out.println();
        }
    }
}
