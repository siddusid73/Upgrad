package OOPS.Access_Modifier;

class BankAccount {

    // Private data 
    private String customerName;
    private int accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String customerName, int accountNumber, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Public method to check balance
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Public method to display account details
    public void displayAccountDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
    }
}

// Main class
public class BankingSystem {

    public static void main(String[] args) {

        // Creating account
        BankAccount customer1 = new BankAccount("Siddu", 7835, 50000);

        customer1.displayAccountDetails();

        customer1.deposit(2000);
        customer1.withdraw(1500);
        customer1.checkBalance();

        // Not allowed because balance is private
        // customer1.balance = 100000; // ERROR
    }
}