public class avgsalary {
    public static void main(String[] args) {
        System.out.println(average(new int[]{1010, 30007, 2000}));

    }
    public static double average(int[] salary) {
        int max=100;
        int min=10000000;
        double avg = 0;

        for(int i=0;i<salary.length;i++){
            if(max<salary[i]) {
                max = salary[i];
            } else if(min>salary[i]){
                min=salary[i];
            }
            avg=(min+max)/2;

        }
        return avg;
    }     

}
