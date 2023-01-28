import groovy.json.JsonOutput;

class super_class{
    public void color(){
        System.out.println("colour is red");
    }
}
class sub_class extends super_class {
    public void color(){
        System.out.println("colour is white");
    }
    public void method(){
        sub_class ok=new sub_class();
        ok.color();
        super.color();

    }

    public static void main(String[] args) {
        sub_class okk=new sub_class();
        okk.method();
    }
}
