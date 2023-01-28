public class data_type {


    public static void main(String[] args) {
        int a=23;
        float b= 23.44f;
        double c=23.33;
        long l=  782L;
        byte d=45;

        System.out.println(dataTypes(a,b,c,l,d));
    }
    // Function to do operations with different data types
    static boolean dataTypes(int a, float b, double c, long l, byte d){

        double p = c/(double)b;//c/b
        double q = (double) b/(double) a;//b/a
        double r = c/(double) a;//c/a
        double m =r+(double) l;//r+l
        int s = a/(int)d;//a/d

        //Printing all the results
        System.out.println(p + " " + q + " " + r + " " + m + " " + s);

        return false;
    }
}
