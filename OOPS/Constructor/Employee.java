package OOPS.Constructor;

public class Employee {
    String name;
    int id;
    double salary;

    Employee(){
        name = "Sid";
        id = 0;
        salary = 0.0;
    }

    void display(){
        System.out.println("Employee Name:" +name);
        System.out.println("EMployee ID:"+id);
        System.out.println("Employee Salary"+salary);
    }

    public static void main(String[] args) {
        
        Employee emp = new Employee();
        System.out.println();
        emp.display();
    }
}
