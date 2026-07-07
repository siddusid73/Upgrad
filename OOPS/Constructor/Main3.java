package OOPS.Constructor;

public class Main3 {
    String name;
    int age;

    Main3(String n,int a){
        this.name = n;
        this.age = a;
    }

    public static void main(String[] args){
        Main3 obj = new Main3("Ram",25 );
        Main3 obj2 = new Main3("Sita",24);

        System.out.println("Name1:"+obj.name);
        System.out.println("Name2:"+obj2.name);
    }
}
