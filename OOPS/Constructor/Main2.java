package OOPS.Constructor;

public class Main2 {
    String name;
    int age;
    String city;

    //1.No-Arg Constructor
    Main2(){
        name = "Ram";
        age  = 22;
        city = "Vijayawada";
        System.out.println("Constructor is called ");
    }
    public static void main(String[] args){
        Main2 obj = new Main2();
        System.out.println("Name:"+obj.name);
        System.out.println("Age:"+obj.age);
        System.out.println("City:"+obj.city);
    }
}
