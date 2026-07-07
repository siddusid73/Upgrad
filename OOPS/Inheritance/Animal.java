package OOPS.Inheritance;

import OOPS.Access_Modifier.Company;

public class Animal {
    String name;

    public void eat() {
        System.out.println("I can Eat");
    }
}

class Dog extends Animal {
    public void display() {
        System.out.println("My name is " + name);
    }
    public void eat(){
        System.out.println("I can eat Dog Food");
    }
}

class Main {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.name = "Rocky";
        obj.display();
        obj.eat();
        
        Company obj1 = new Company();
        obj1.display();
    }
}
