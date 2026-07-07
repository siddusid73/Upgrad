package OOPS.Access_Modifier;

class Animal {
    protected void display() {
        System.out.println("I am an animal");
    }
}

class Dog extends Animal {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();

        Example3 obj = new Example3();
        obj.message();
    }
}
