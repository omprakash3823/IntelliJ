class parent{
    int a;
    public void addition(int x,int y){
        a=x+y;
        System.out.println("addition is "+a);
    }
    public void substraction(int x,int y){
        a=x-y;
        System.out.println("substraction is "+a);
    }
}





public class child extends parent {
    public void multiplication(int x,int y){
     a=x*y;
    System.out.println("multiplication is "+a);
}
    public static void main(String[] args) {
        int x=20,y=8;
        child ok=new child();
        ok.addition(x,y);
        ok.substraction(x,y);
        ok.multiplication(x,4);

    }
}
