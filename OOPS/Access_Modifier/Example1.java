package OOPS.Access_Modifier;

class Test {
    private int age;
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public class Example1 {
        public static void main(String[] args) {
            Test obj = new Test();
            obj.setName("Siddu");
            obj.setAge(22);

            System.out.println("Name is : " + obj.getName());
            System.out.println("Age is : "+obj.getAge());
        }
    }
}
