import java.nio.charset.StandardCharsets;

public class solution5 {
    public static void main(String[] args) {
        System.out.println( sum(2, 4));
    }

    public static int sum(int num1, int num2) {

        byte n1 = (byte) num1;
        byte n2 = (byte) num2;

        return n1 + n2;
    }

}
