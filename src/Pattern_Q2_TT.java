//Pattern
//*****
//*   *
//*   *
//*   *
//*****


public class Pattern_Q2_TT {
    public static void main(String[] args) {
        int a = 5;
        for (int i = 0; i < a; i++) {
            if (i == 0 || i == (a - 1)) {
                for (int j = 0; j < 5; j++) {
                    System.out.print("*");

                }
                System.out.println();
            } else {
                for (int j = 0; j < 5; j++) {
                    if (j == 0 || j == (5 - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
