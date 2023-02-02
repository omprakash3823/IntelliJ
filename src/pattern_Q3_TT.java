//Pattern
// *******
//*        *
//*    *   *
//*        *
//*******


public class pattern_Q3_TT {
    public static void main(String[] args) {
        int a = 5;
        for (int i = 0; i < a; i++) {
            if (i == 0 || i == (a - 1)) {
                for (int j = 0; j < 7; j++) {
                    System.out.print("*");

                }
                System.out.println();
            } else if (i == 2) {
                for (int j = 0; j < 7; j++) {
                    if (j == 0 || j == 3 || j == 6) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            } else {
                for (int j = 0; j < 7; j++) {
                    if (j == 0 || j == (7 - 1)) {
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
