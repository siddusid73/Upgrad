package OOPS.Inheritance;

class Dept_info {
    int emp_size = 100;

    int sales = 20;
    int hr = 5;
    int operations = 10;

    public void displayCount() {
        System.out.println("Company Employees " + emp_size);
    }
}

class SalesDept extends Dept_info {
    public void dispalyCount() {
        System.out.println("Sales Dept Count " + sales);
    }
}

class HrDept extends Dept_info {
    public void displayCount() {
        System.out.println("HR Dept Count " + hr);
    }
}

class OperationDept extends Dept_info {
    public void dispalyCount() {
        System.out.println("Operation Dept count " + operations);
    }
}

public class Company{
    public static void main(String[] args) {
        Dept_info d = new Dept_info();
        SalesDept s = new SalesDept();
        HrDept h = new HrDept();
        OperationDept o = new OperationDept();

        d.displayCount();
        s.dispalyCount();
        h.displayCount();
        o.dispalyCount();
    }
}