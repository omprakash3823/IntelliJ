public class After_one_swap_match_string {

    public static void main(String[] args) {
        String s1="rama";
        String s2="aamr";
        System.out.println(areAlmostEqual(s1,s2));
    }
    public static boolean areAlmostEqual(String s1, String s2) {
        char[] c=s1.toCharArray();
        System.out.println(c[0]);
//        char temp;
        for(int i=0;i<c.length;i++){
            for (int j = i+1; j <c.length ; j++) {

            char temp=c[i];
            c[i]=c[j];
            c[j]=temp;
                System.out.println(c);
            if(c.equals(s2)){
                return true;
            }

        }
        }


                return false;
            }

}


